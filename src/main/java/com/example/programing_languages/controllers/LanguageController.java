package com.example.programing_languages.controllers;

import com.example.programing_languages.entities.Language;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {

//    languageService e bağımlı
    @PostMapping
    public  void add(@RequestBody Language language){


    }

    @GetMapping
    public List<Language> get() {
//        return productService.getAll();
        return null;
    }

}
