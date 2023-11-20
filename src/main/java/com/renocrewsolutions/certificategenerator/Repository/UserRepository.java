package com.renocrewsolutions.certificategenerator.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.renocrewsolutions.certificategenerator.Entity.User;

@Repository

	public interface UserRepository extends CrudRepository <User, Long> {
	    // Add custom query methods if needed

	
}
