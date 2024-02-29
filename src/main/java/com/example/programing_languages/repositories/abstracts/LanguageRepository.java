package com.example.programing_languages.repositories.abstracts;

import com.example.programing_languages.entities.Language;

import java.util.List;

public interface LanguageRepository {
    void  add(Language language);
    void   update(Language language);
    void   delete(Language language);

    List<Language> getAll();
    Language getById(int id);
}
