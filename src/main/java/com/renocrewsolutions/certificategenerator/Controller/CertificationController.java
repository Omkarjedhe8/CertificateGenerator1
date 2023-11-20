package com.renocrewsolutions.certificategenerator.Controller;

import java.util.List;
import java.util.Optional;

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

import com.renocrewsolutions.certificategenerator.Entity.Certification;
import com.renocrewsolutions.certificategenerator.Service.CertificationService;


@RestController
public class CertificationController {

	 @Autowired
		private CertificationService certificationService;

		
	    public CertificationController(CertificationService certificationService) {
	        this.certificationService = certificationService;
			this.certificationService = certificationService;
		}

	    @GetMapping("/certification")
	    public ResponseEntity<List<Certification>> getAllCertifications() {
	        List<Certification> certifications = (List<Certification>) certificationService.getAllCertifcation();
	        return new ResponseEntity<>(certifications, HttpStatus.OK);
	    }

	    @GetMapping("/certification/{certiId}")
	    public Optional<Certification> getCertificationById(@PathVariable Long certiId) {
			
			Optional<Certification> certification = certificationService.getCertifcationById(certiId);
	        if (certification != null) {
	        	
	        	
	        	return certificationService.getCertifcationById(certiId);
	            
	            
	        }
			return certification; 
	    }

	 		
	

		@PostMapping("/certification")
	    public ResponseEntity<Certification> createCertification(@RequestBody Certification certification) {
	    	Certification createdCertification = certificationService.createCertification(certification);
	        return new ResponseEntity<>(createdCertification, HttpStatus.CREATED);
	    }

	    @PutMapping("/certification/{id}")
	    public ResponseEntity<Certification> updateCertification(
	            @PathVariable("certiId") Long certiId, @RequestBody Certification certification) {
	    	Certification updatedCertification = certificationService.updateCertification(certification);
	        if (updatedCertification != null) {
	            return new ResponseEntity<>(updatedCertification, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @DeleteMapping("/certification/{id}")
	    public ResponseEntity<Void> deleteCertification(@PathVariable("certiId") Long certiId) {
	        boolean deleted = certificationService.deleteCertification(certiId);
	        if (deleted) {
	            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	
}
