package com.vermeg.qa_management.services;

import com.vermeg.qa_management.entities.Question;
import com.vermeg.qa_management.repositories.QuestionRepository;
import com.vermeg.qa_management.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Question getQuestionById(Long id) {
        return questionRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Question not found with id: " + id));
    }

    public Question createQuestion(Question question) {
        return questionRepository.save(question);
    }

    public Question updateQuestion(Long id, Question updatedQuestion) {
        Question question = getQuestionById(id);
        question.setQuestion(updatedQuestion.getQuestion());
        question.setAnswer(updatedQuestion.getAnswer());
        question.setTheme(updatedQuestion.getTheme());
        question.setSubTheme(updatedQuestion.getSubTheme());
        question.setCategory(updatedQuestion.getCategory());
        return questionRepository.save(question);
    }

    public void deleteQuestion(Long id) {
        Question question = getQuestionById(id);
        questionRepository.delete(question);
    }
}
