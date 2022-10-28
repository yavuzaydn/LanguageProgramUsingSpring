package JavaBootcampHW22.language.webAPI.controllers;

import JavaBootcampHW22.language.entities.concretes.Language;
import JavaBootcampHW22.language.service.abstracts.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
    @Autowired
    private LanguageService languageService;

    @GetMapping("/getall")
    public List<Language> getAllLanguages(){
        return languageService.getAll();
    }
    @PostMapping
    public Language addLanguage(Language language) throws Exception {
        return languageService.add(language);
    }
    @DeleteMapping("/{languageId}")
    public void delete(int languageId) throws Exception {
        languageService.delete(languageId);
    }
    @GetMapping("/{languageId}")
    public Language findById(int languageId) throws Exception {
        return languageService.findById(languageId);
    }



}
