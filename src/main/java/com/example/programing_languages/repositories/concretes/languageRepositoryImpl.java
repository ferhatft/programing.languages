package com.example.programing_languages.repositories.concretes;

import com.example.programing_languages.entities.Language;
import com.example.programing_languages.repositories.abstracts.LanguageRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class languageRepositoryImpl implements LanguageRepository
{
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
