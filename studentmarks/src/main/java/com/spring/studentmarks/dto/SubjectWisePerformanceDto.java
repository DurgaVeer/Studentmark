package com.spring.studentmarks.dto;

import java.util.List;

public class SubjectWisePerformanceDto {
    private String subjectName;
	
	private List<SubjectWisePerformanceDto> noOfStudentAttempted;
	
	private List<SubjectWisePerformanceDto> noOfPass;
	
	private List<SubjectWisePerformanceDto> noOfFail;
	
	private List<ClassWisePerformanceDto> passPercentage;
	
	private List<ClassWisePerformanceDto> failPercentage;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public List<SubjectWisePerformanceDto> getNoOfStudentAttempted() {
		return noOfStudentAttempted;
	}

	public void setNoOfStudentAttempted(List<SubjectWisePerformanceDto> list) {
		this.noOfStudentAttempted = list;
	}

	public List<SubjectWisePerformanceDto> getNoOfPass() {
		return noOfPass;
	}

	public void setNoOfPass(List<SubjectWisePerformanceDto> list) {
		this.noOfPass = list;
	}

	public List<SubjectWisePerformanceDto> getNoOfFail() {
		return noOfFail;
	}

	public void setNoOfFail(List<SubjectWisePerformanceDto> list) {
		this.noOfFail = list;
	}

	public List<ClassWisePerformanceDto> getPassPercentage() {
		return passPercentage;
	}

	public void setPassPercentage(List<ClassWisePerformanceDto> list) {
		this.passPercentage = list;
	}

	public List<ClassWisePerformanceDto> getFailPercentage() {
		return failPercentage;
	}

	public void setFailPercentage(List<ClassWisePerformanceDto> list) {
		this.failPercentage = list;
	}

}
