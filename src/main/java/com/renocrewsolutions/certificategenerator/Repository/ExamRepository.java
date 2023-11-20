package com.renocrewsolutions.certificategenerator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renocrewsolutions.certificategenerator.Entity.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
    // Add custom query methods if needed
}
