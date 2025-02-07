package com.vermeg.qa_management.repositories;

import com.vermeg.qa_management.entities.FlaggedQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlaggedQuestionRepository extends JpaRepository<FlaggedQuestion, Long> {
}
