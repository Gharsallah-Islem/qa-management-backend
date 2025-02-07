package com.vermeg.qa_management.services;

import com.vermeg.qa_management.entities.Theme;
import com.vermeg.qa_management.repositories.ThemeRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ThemeService {
    private final ThemeRepository themeRepository;

    public ThemeService(ThemeRepository themeRepository) {
        this.themeRepository = themeRepository;
    }

    public List<Theme> getAllThemes() {
        return themeRepository.findAll();
    }

    public Optional<Theme> getThemeById(Integer id) {
        return themeRepository.findById(id);
    }
}
