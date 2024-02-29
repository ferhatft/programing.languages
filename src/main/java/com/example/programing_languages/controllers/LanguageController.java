package com.example.programing_languages.controllers;

import com.example.programing_languages.entities.Language;
import com.example.programing_languages.services.abstracts.LanguageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {

//    languageService e bağımlı
    private LanguageService languageService;
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @PostMapping("/add/")
    public  void add(@RequestBody Language language){
        this.languageService.add(language);

    }

    @PutMapping("/update/")
    public  void update(@RequestBody Language language){
        this.languageService.update(language);

    }

    @PostMapping("/delete/")
    public  void delete(@RequestBody Language language){
        this.languageService.delete(language);

    }


    @GetMapping("/get/")
    public List<Language> getAll() {
        return languageService.getAll();
    }

    @GetMapping("/get/{id}")
    public Language getById(@PathVariable int id) {
        return languageService.getById(id);
    }

}
