package com.renocrewsolutions.certificategenerator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renocrewsolutions.certificategenerator.Entity.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    // Add custom query methods if needed
}
