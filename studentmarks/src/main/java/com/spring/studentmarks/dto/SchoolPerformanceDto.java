package com.spring.studentmarks.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public class SchoolPerformanceDto {

	
 
	public void setId(UUID id) {
		this.id = id;
	}
	private UUID id;
	private  String school;
	private Integer noOfStudents;
	private Integer noOfPass;
	private Integer noOfFail;
	private Double passPercentage;
	private Double failPercentage;


	
	
	public UUID getId() {
		return id;
	}
	public void setId() {
		this.id = id;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public Integer getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(Integer noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public Integer getNoOfPass() {
		return noOfPass;
	}
	public void setNoOfPass(Integer noOfPass) {
		this.noOfPass = noOfPass;
	}
	public Integer getNoOfFail() {
		return noOfFail;
	}
	public void setNoOfFail(Integer noOfFail) {
		this.noOfFail = noOfFail;
	}
	public Double getPassPercentage() {
		return passPercentage;
	}
	public void setPassPercentage(Double schoolfailPercentage) {
		this.passPercentage = schoolfailPercentage;
	}
	public Double getFailPercentage() {
		return failPercentage;
	}
	public void setFailPercentage(Double failPercentage) {
		this.failPercentage = failPercentage;
	}
	
}



