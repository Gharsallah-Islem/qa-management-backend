package com.vermeg.qa_management.controllers;

import com.vermeg.qa_management.entities.SubTheme;
import com.vermeg.qa_management.services.SubThemeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/subthemes")
@CrossOrigin(origins = "*")
public class SubThemeController {

    private final SubThemeService subThemeService;

    public SubThemeController(SubThemeService subThemeService) {
        this.subThemeService = subThemeService;
    }

    @GetMapping
    public List<SubTheme> getAllSubThemes() {
        return subThemeService.getAllSubThemes();
    }
}
