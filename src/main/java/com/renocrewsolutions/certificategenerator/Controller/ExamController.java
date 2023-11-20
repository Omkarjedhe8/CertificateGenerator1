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

import com.renocrewsolutions.certificategenerator.Entity.Exam;
import com.renocrewsolutions.certificategenerator.Service.ExamService;

@RestController
public class ExamController {

	@Autowired
	private ExamService examService;


    public ExamController(ExamService examService) {
        this.examService = examService;
    }

    @GetMapping("/exam")
    public ResponseEntity<List<Exam>> getAllExams() {
        List<Exam> exams = (List<Exam>) examService.getAllExam();
        return new ResponseEntity<>(exams, HttpStatus.OK);
    }

    @GetMapping("/exam/{examId}")
    public Optional<Exam> getExamById(@PathVariable Long examId) {
		
		Optional<Exam> exam = examService.getExamById(examId);
        if (exam != null) {
        	
        	return examService.getExamById(examId);
            
            
        }
		return exam; 
    }

    @PostMapping("/exam")
    public ResponseEntity<Exam> createExam(@RequestBody Exam  exam ) {
    	Exam createdExam = examService.createExam(exam);
        return new ResponseEntity<>(createdExam, HttpStatus.CREATED);
    }

    @PutMapping("/exam/{examId}")
    public ResponseEntity<Exam> updateExam(@PathVariable("examId") Long examId, @RequestBody Exam exam) {
    	Exam updatedExam = examService.updateExam(exam);
        if (updatedExam != null) {
            return new ResponseEntity<>(updatedExam, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }   


    @DeleteMapping("/{examId}")
    public ResponseEntity<Void> deleteResult(@PathVariable("resultId") Long examId) {
        
		boolean deleted = examService.deleteExam(examId);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }    


}
