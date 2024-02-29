package com.example.programing_languages.services.concretes;

import com.example.programing_languages.entities.Language;
import com.example.programing_languages.services.abstracts.LanguageService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class languageServiceImpl implements LanguageService
{

//    Repository e bağımlı
    @Override
    public void add(Language language) {

    }

    @Override
    public void update(Language language) {

    }

    @Override
    public void delete(Language language) {

    }

    @Override
    public List<Language> getAll() {
        return null;
    }

    @Override
    public Language getById(int id) {
        return null;
    }
}
