package com.example.programing_languages.repositories.concretes;

import com.example.programing_languages.entities.Language;
import com.example.programing_languages.repositories.abstracts.LanguageRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class languageRepositoryImpl implements LanguageRepository
{
    private  List<Language> languageList = new ArrayList<>();
    @Override
    public void add(Language language) {
        languageList.add(language);
    }

    @Override
    public void update(Language language) {

    }

    @Override
    public void delete(Language language) {

    }

    @Override
    public List<Language> getAll() {
        return languageList;
    }

    @Override
    public Language getById(int id) {
        return languageList.get(id) ;
    }
}
