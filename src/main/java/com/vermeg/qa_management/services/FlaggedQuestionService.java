package com.vermeg.qa_management.services;

import com.vermeg.qa_management.entities.FlaggedQuestion;
import com.vermeg.qa_management.repositories.FlaggedQuestionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FlaggedQuestionService {
    private final FlaggedQuestionRepository flaggedQuestionRepository;

    public FlaggedQuestionService(FlaggedQuestionRepository flaggedQuestionRepository) {
        this.flaggedQuestionRepository = flaggedQuestionRepository;
    }

    public FlaggedQuestion addFlaggedQuestion(FlaggedQuestion flaggedQuestion) {
        return flaggedQuestionRepository.save(flaggedQuestion);
    }

    public List<FlaggedQuestion> getAllFlaggedQuestions() {
        return flaggedQuestionRepository.findAll();
    }
}
