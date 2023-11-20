package com.renocrewsolutions.certificategenerator.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Exam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long examId;
	
	private String examName;
	private String examDescrption;
	private String examDuration;
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exam(Long examId, String examName, String examDescrption, String examDuration) {
		super();
		this.examId = examId;
		this.examName = examName;
		this.examDescrption = examDescrption;
		this.examDuration = examDuration;
	}
	public Long getExamId() {
		return examId;
	}
	public void setExamId(Long examId) {
		this.examId = examId;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getExamDescrption() {
		return examDescrption;
	}
	public void setExamDescrption(String examDescrption) {
		this.examDescrption = examDescrption;
	}
	public String getExamDuration() {
		return examDuration;
	}
	public void setExamDuration(String examDuration) {
		this.examDuration = examDuration;
	}
	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", examName=" + examName + ", examDescrption=" + examDescrption
				+ ", examDuration=" + examDuration + "]";
	}
	
	
	
}
