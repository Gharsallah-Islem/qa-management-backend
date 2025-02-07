package com.vermeg.qa_management.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "flagged_questions")
@Getter
@Setter
public class FlaggedQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "question_text", columnDefinition = "TEXT", nullable = false)
    private String questionText;

    @Column(name = "flagged_at", nullable = false)
    private LocalDateTime flaggedAt;

    @PrePersist
    protected void onCreate() {
        flaggedAt = LocalDateTime.now();
    }
    public FlaggedQuestion() {
    }
    public FlaggedQuestion(Long id, String questionText, LocalDateTime flaggedAt) {
        this.id = id;
        this.questionText = questionText;
        this.flaggedAt = flaggedAt;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getQuestionText() {
        return questionText;
    }
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
    public LocalDateTime getFlaggedAt() {
        return flaggedAt;
    }
    public void setFlaggedAt(LocalDateTime flaggedAt) {
        this.flaggedAt = flaggedAt;
    }
    @Override
    public String toString() {
        return "FlaggedQuestion{" +
                "id=" + id +
                ", questionText='" + questionText + '\'' +
                ", flaggedAt=" + flaggedAt +
                '}';
    }
}
