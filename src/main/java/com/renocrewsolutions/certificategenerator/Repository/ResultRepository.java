package com.renocrewsolutions.certificategenerator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renocrewsolutions.certificategenerator.Entity.Result;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {
    // Add custom query methods if needed
}
