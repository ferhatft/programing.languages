package com.example.programing_languages.services.concretes;

import com.example.programing_languages.entities.Language;
import com.example.programing_languages.repositories.abstracts.LanguageRepository;
import com.example.programing_languages.services.abstracts.LanguageService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class languageServiceImpl implements LanguageService
{
    private LanguageRepository languageRepository;
    public languageServiceImpl(LanguageRepository languageRepository) {
        this.languageRepository =languageRepository;
    }

    //    Repository e bağımlı
    @Override
    public void add(Language language) {
        List<Language> existingLanguages = languageRepository.getAll();

        for (Language existingLanguage : existingLanguages) {
            if (existingLanguage.getLanguage().equals(language.getLanguage())) {
                // Eğer dil zaten mevcutsa, bir hata fırlatılabilir veya uygun bir işlem yapılabilir
                throw new RuntimeException("Bu dil zaten mevcut!");
            }
        }

        languageRepository.add(language);
    }

    @Override
    public void update(Language language) {

    }

    @Override
    public void delete(Language language) {
        languageRepository.delete(language);
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll() ;
    }

    @Override
    public Language getById(int id) {
        return languageRepository.getById(id) ;
    }
}
