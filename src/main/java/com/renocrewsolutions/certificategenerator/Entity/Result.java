package com.renocrewsolutions.certificategenerator.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

@Entity
public class Result {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long resultId;
	
	
	private int resultScore;
	private Date resultDate;
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Result(Long resultId, com.renocrewsolutions.certificategenerator.Entity.User id,
			com.renocrewsolutions.certificategenerator.Entity.Exam examId, int resultScore, Date resultDate) {
		super();
		this.resultId = resultId;
				this.resultScore = resultScore;
		this.resultDate = resultDate;
	}
	public Long getResultId() {
		return resultId;
	}
	public void setResultId(Long resultId) {
		this.resultId = resultId;
	}
	
	public int getResultScore() {
		return resultScore;
	}
	public void setResultScore(int resultScore) {
		this.resultScore = resultScore;
	}
	public Date getResultDate() {
		return resultDate;
	}
	public void setResultDate(Date resultDate) {
		this.resultDate = resultDate;
	}

	
}
