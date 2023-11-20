package com.renocrewsolutions.certificategenerator.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.renocrewsolutions.certificategenerator.Entity.Organization;
import com.renocrewsolutions.certificategenerator.Service.OrganizationService;

@RestController
public class OrganizationController {
	
	@Autowired
		private final OrganizationService organizationService;

	    
	    public OrganizationController (OrganizationService organizationService) {
	        this.organizationService= organizationService;
	    }

	    @GetMapping("/organization")
	    public ResponseEntity<List<Organization>> getAllOrganization() {
	        List<Organization> organizations = (List<Organization>) organizationService.getAllOrganization();
	        return new ResponseEntity<>(organizations, HttpStatus.OK);
	    }

	    @GetMapping("/organization/{orgId}")
	    public ResponseEntity<Organization> getOrganizationById(@PathVariable Long orgId) {
	        return organizationService.getOrganizationById(orgId)
	                .map(organization -> new ResponseEntity<>(organization, HttpStatus.OK))
	                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	    }

	    @PostMapping("/organization")
	    public ResponseEntity<Organization> createOrganization(@RequestBody Organization organization) {
	        Organization createdOrganization = organizationService.createOrganization(organization);
	        return new ResponseEntity<>(createdOrganization, HttpStatus.CREATED);
	    }

	    @PutMapping("/organization/{orgId}")
	    public ResponseEntity<Organization> updateOrganization(@PathVariable Long orgId, @RequestBody Organization organization) {
	        organization.setOrgId(orgId);
	        Organization updatedOrganization = organizationService.updateOrganization(organization);
	        return new ResponseEntity<>(updatedOrganization, HttpStatus.OK);
	    }

	    @DeleteMapping("/organization/{orgId}")
	    public ResponseEntity<Void> deleteOrganization(@PathVariable Long orgId) {
	    	OrganizationService.deleteOrganization(orgId);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }
	



}
