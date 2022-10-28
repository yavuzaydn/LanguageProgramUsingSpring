package JavaBootcampHW22.language.repository.abstracts;

import JavaBootcampHW22.language.entities.concretes.Language;

import java.util.List;

public interface LanguageRepository {
    List<Language> getAll();
    Language add(Language language);
    void delete(int LanguageId);
    Language findById(Language language);
}
