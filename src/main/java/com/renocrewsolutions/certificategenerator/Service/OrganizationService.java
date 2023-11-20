package com.renocrewsolutions.certificategenerator.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renocrewsolutions.certificategenerator.Entity.Organization;
import com.renocrewsolutions.certificategenerator.Repository.OrganizationRepository;

@Service
public class OrganizationService {
	
	@Autowired
	 private  OrganizationRepository organizationRepository;
		    
		    public OrganizationService( OrganizationRepository  organizationRepository) {
		        this. organizationRepository =  organizationRepository;
		    }

		    public Iterable<Organization> getAllOrganization() {
		        return organizationRepository.findAll();
		    }

		    public Optional<Organization> getOrganizationById(Long orgId) {
			
				return organizationRepository.findById(orgId);
		    }

		    public Organization createOrganization( Organization organization){
		        return organizationRepository.save(organization);
		    }
		    

		    public Organization updateOrganization(Organization organization) {
		        return organizationRepository.save(organization);
		    }

		    public void deleteCertification(Long orgId) {
		    	organizationRepository.deleteById(orgId);
		    }

			public static void deleteOrganization(Long orgId) {
				// TODO Auto-generated method stub
				
			}



}
