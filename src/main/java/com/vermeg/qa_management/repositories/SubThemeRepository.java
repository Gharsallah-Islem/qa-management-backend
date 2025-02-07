package com.vermeg.qa_management.repositories;

import com.vermeg.qa_management.entities.SubTheme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubThemeRepository extends JpaRepository<SubTheme, Integer> {
}