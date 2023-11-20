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

import com.renocrewsolutions.certificategenerator.Entity.Result;
import com.renocrewsolutions.certificategenerator.Service.ResultService;

@RestController
public class ResultController {
	
	@Autowired
	 private final ResultService resultService;
		
	   public ResultController(ResultService resultService) {
	        this.resultService = resultService;
	    }

	    @GetMapping("/result")
	    public ResponseEntity<List<Result>> getAllResults() {
	        List<Result> results = (List<Result>) resultService.getAllResult();
	        return new ResponseEntity<>(results, HttpStatus.OK);
	    }

	    @GetMapping("/result/{resultId}")
	    public ResponseEntity<Result> getResultById(@PathVariable Long resultId) {
			
	        	return resultService.getResultById(resultId)
		                .map(result -> new ResponseEntity<>(result, HttpStatus.OK))
		                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	        }
	    
	    

	    @PostMapping("/result")
	    public ResponseEntity<Result> createResult(@RequestBody Result result) {
	        Result createdResult = resultService.createResult(result);
	        return new ResponseEntity<>(createdResult, HttpStatus.CREATED);
	    }

	    @PutMapping("/result/{resultId}")
	    public ResponseEntity<Result> updateResult(
	            @PathVariable("resultId") Long resultId, @RequestBody Result result) {
	        Result updatedResult = resultService.updateResult(result);
	        if (updatedResult != null) {
	            return new ResponseEntity<>(updatedResult, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @DeleteMapping("/result/{resultId}")
	    public ResponseEntity<Void> deleteResult(@PathVariable("resultId") Long resultId) {
	        boolean deleted = resultService.deleteResult(resultId);
	        if (deleted) {
	            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }


}
