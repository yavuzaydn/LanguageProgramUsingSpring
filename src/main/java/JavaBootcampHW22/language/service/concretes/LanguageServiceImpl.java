package JavaBootcampHW22.language.service.concretes;

import JavaBootcampHW22.language.entities.concretes.Language;
import JavaBootcampHW22.language.repository.abstracts.LanguageRepository;
import JavaBootcampHW22.language.service.abstracts.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {
    private LanguageRepository languageRepository;

    @Autowired
    public LanguageServiceImpl(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public Language add(Language language) throws Exception {
        if(language.getName().isEmpty()){
            throw new Exception("Error");
        }
        return languageRepository.add(language);
    }

    @Override
    public void delete(int id) throws Exception {
        List<Language> languages =  languageRepository.getAll();
        for (Language language : languages){
            if (language.getId() == id){
                languageRepository.delete(id);
                break;
            }else {
                throw new Exception("Error");
            }
        }

    }

    @Override
    public Language findById(int languageById) throws Exception {
        List<Language> languages = languageRepository.getAll();
        for (Language language : languages){
            if(language.getId() == languageById){
                return language;
            }else {
                throw new Exception("Error");
            }
        }
        return null;
    }
}
