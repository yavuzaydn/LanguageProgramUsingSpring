package JavaBootcampHW22.language.service.abstracts;

import JavaBootcampHW22.language.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    List<Language> getAll();
    Language add(Language language) throws Exception;
    void delete(int id) throws Exception;
    Language findById(int LanguageById) throws Exception;
}
