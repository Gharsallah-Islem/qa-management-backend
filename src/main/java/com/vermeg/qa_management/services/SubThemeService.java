package com.vermeg.qa_management.services;

import com.vermeg.qa_management.entities.SubTheme;
import com.vermeg.qa_management.repositories.SubThemeRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SubThemeService {
    private final SubThemeRepository subThemeRepository;

    public SubThemeService(SubThemeRepository subThemeRepository) {
        this.subThemeRepository = subThemeRepository;
    }

    public List<SubTheme> getAllSubThemes() {
        return subThemeRepository.findAll();
    }

    public Optional<SubTheme> getSubThemeById(Integer id) {
        return subThemeRepository.findById(id);
    }
}
