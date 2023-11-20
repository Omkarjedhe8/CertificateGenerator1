package com.renocrewsolutions.certificategenerator.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renocrewsolutions.certificategenerator.Entity.Exam;
import com.renocrewsolutions.certificategenerator.Repository.ExamRepository;

@Service
public class ExamService {
	
    @Autowired
	  private  ExamRepository examRepository;
	    public ExamService( ExamRepository examRepository) {
	        this. examRepository =  examRepository;
	    }

	    public Iterable<Exam> getAllExam() {
	        return  examRepository.findAll();
	    }

	    public Optional<Exam> getExamById(Long examId) {
		
			return examRepository.findById(examId);
	    }

	    public Exam createExam( Exam exam){
	        return examRepository.save(exam);
	    }
	    

	    public Exam updateExam(Exam exam) {
	        return examRepository.save(exam);
	    }

	    public boolean deleteExam(Long examId) {
	    	 examRepository.deleteById(examId);
			return false;
	    }

	
	

}
