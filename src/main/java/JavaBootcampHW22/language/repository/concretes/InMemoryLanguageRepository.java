package JavaBootcampHW22.language.repository.concretes;

import JavaBootcampHW22.language.entities.concretes.Language;
import JavaBootcampHW22.language.repository.abstracts.LanguageRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

    List<Language> languages;

    public InMemoryLanguageRepository(){
        this.languages = new ArrayList<Language>();
        languages.add(new Language(1,"C#"));
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public Language add(Language language) {
        languages.add(language);
        return language;
    }

    @Override
    public void delete(int LanguageId) {

        for(Language language : languages){
            if(language.getId() == LanguageId){
                languages.remove(language);
                break;
            }
        }
    }

    @Override
    public Language findById(Language language) {
        for (Language requestedLanguage : languages){
            if(requestedLanguage.getId() == language.getId()){
                return requestedLanguage;
            }
        }
        return null;
    }
}
