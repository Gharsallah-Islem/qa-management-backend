package com.vermeg.qa_management.controllers;

import com.vermeg.qa_management.entities.FlaggedQuestion;
import com.vermeg.qa_management.services.FlaggedQuestionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/flagged-questions")
@CrossOrigin(origins = "*")
public class FlaggedQuestionController {

    private final FlaggedQuestionService flaggedQuestionService;

    public FlaggedQuestionController(FlaggedQuestionService flaggedQuestionService) {
        this.flaggedQuestionService = flaggedQuestionService;
    }

    @PostMapping
    public FlaggedQuestion addFlaggedQuestion(@RequestBody FlaggedQuestion flaggedQuestion) {
        return flaggedQuestionService.addFlaggedQuestion(flaggedQuestion);
    }

    @GetMapping
    public List<FlaggedQuestion> getAllFlaggedQuestions() {
        return flaggedQuestionService.getAllFlaggedQuestions();
    }
}
