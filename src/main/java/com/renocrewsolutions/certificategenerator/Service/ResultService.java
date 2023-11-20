package com.renocrewsolutions.certificategenerator.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renocrewsolutions.certificategenerator.Entity.Result;
import com.renocrewsolutions.certificategenerator.Repository.ResultRepository;

@Service
public class ResultService {
	
	  @Autowired
	 private  ResultRepository resultRepository;
			  
			    public ResultService(ResultRepository resultRepository) {
			        this.resultRepository = resultRepository;
			    }

			    public Iterable<Result> getAllResult() {
			        return resultRepository.findAll();
			    }

			    public Optional<Result> getResultById(Long resultId) {
				
					return resultRepository.findById(resultId);
			    }

			    public Result createResult(  Result  result){
			        return resultRepository.save( result);
			    }
			    

			    public Result updateResult( Result  result) {
			        return resultRepository.save( result);
			    }

			    public boolean deleteResult(Long resultId) {
			    	resultRepository.deleteById(resultId);
					return false;
			    }


}
