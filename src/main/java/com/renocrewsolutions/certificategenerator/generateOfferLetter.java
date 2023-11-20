package com.renocrewsolutions.certificategenerator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class generateOfferLetter {
	
	private String internName;
	private String internshipTitle;
	private Date startDate;
	private Date endDate;
	private String companyName;
	private String companyAddress;
	public generateOfferLetter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public generateOfferLetter(String internName, String internshipTitle, Date startDate, Date endDate,
			String companyName, String companyAddress) {
		super();
		this.internName = internName;
		this.internshipTitle = internshipTitle;
		this.startDate = startDate;
		this.endDate = endDate;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
	}
	public String getInternName() {
		return internName;
	}
	public void setInternName(String internName) {
		this.internName = internName;
	}
	public String getInternshipTitle() {
		return internshipTitle;
	}
	public void setInternshipTitle(String internshipTitle) {
		this.internshipTitle = internshipTitle;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	@Override
	public String toString() {
		return "generateOfferLetter [internName=" + internName + ", internshipTitle=" + internshipTitle + ", startDate="
				+ startDate + ", endDate=" + endDate + ", companyName=" + companyName + ", companyAddress="
				+ companyAddress + "]";
	}
	
	public byte[] toByteArray() throws IOException {
		

		Path path = Paths.get("C:/Users/shree/Desktop/Mohit/123.pdf");
		byte[] fileBytes = Files.readAllBytes(path);

		// TODO Auto-generated method stub
		return fileBytes;
	}

}
