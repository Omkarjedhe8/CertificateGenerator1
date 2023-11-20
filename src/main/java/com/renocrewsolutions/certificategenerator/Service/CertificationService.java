package com.renocrewsolutions.certificategenerator.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.renocrewsolutions.certificategenerator.Entity.Certification;
import com.renocrewsolutions.certificategenerator.Repository.CertificationRepository;

@Service
public class CertificationService {

	@Autowired
	private  CertificationRepository certificationRepository;
	// Long certificationId;
	 
	    public CertificationService(CertificationRepository certificationRepository) {
	        this.certificationRepository = certificationRepository;
	    }

	    public Iterable<Certification> getAllCertifcation() {
	        return certificationRepository.findAll();
	    }

	    
	    public Optional<Certification> getCertifcationById(Long certiId) {
		
			return certificationRepository.findById(certiId);
	    }

	    public Certification createCertification( Certification certification){
	        return certificationRepository.save(certification);
	    }
	    

	    public Certification updateCertification(Certification certification) {
	        return certificationRepository.save(certification);
	    }

	    public boolean deleteCertification(Long certiId) {
	        certificationRepository.deleteById(certiId);
			return false;
	    }


	
}
