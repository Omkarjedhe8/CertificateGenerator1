package com.renocrewsolutions.certificategenerator.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.renocrewsolutions.certificategenerator.Entity.Certification;

@Repository
public interface CertificationRepository extends CrudRepository<Certification, Long> {
    // Add custom query methods if needed
}
