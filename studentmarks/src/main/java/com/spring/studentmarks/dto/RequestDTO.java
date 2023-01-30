package com.spring.studentmarks.dto;

import java.util.List;
import java.util.UUID;

public class RequestDTO {
	
	private UUID id;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStuClass() {
		return stuClass;
	}
	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}
	public String getTamil() {
		return tamil;
	}
	public void setTamil(String tamil) {
		this.tamil = tamil;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getMaths() {
		return maths;
	}
	public void setMaths(String maths) {
		this.maths = maths;
	}
	public String getScience() {
		return science;
	}
	public void setScience(String science) {
		this.science = science;
	}
	public String getSocialScience() {
		return socialScience;
	}
	public void setSocialScience(String socialScience) {
		this.socialScience = socialScience;
	}
	public double getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public List<SubjectWisePerformanceDto> getSubjectWiseRecords() {
		return subjectWiseRecords;
	}
	public void setSubjectWiseRecords(List<SubjectWisePerformanceDto> subjectWiseRecords) {
		this.subjectWiseRecords = subjectWiseRecords;
	}
	public List<ClassWisePerformanceDto> getClassList() {
		return classList;
	}
	public void setClassList(List<ClassWisePerformanceDto> classList) {
		this.classList = classList;
	}
	public List<SubjectMarkDto> getSubList() {
		return subList;
	}
	public void setSubList(List<SubjectMarkDto> subList) {
		this.subList = subList;
	}
	public List<SchoolPerformanceDto> getSchoolList() {
		return schoolList;
	}
	public void setSchoolList(List<SchoolPerformanceDto> schoolList) {
		this.schoolList = schoolList;
	}
	private String name;
	private int rollNo;
	private String stuClass;
	private String tamil;
	private String english;
	private String maths;
	private String science;
	private String socialScience;
	private double totalMarks;
	private double percentage;
	private String createdBy;
	private List<SubjectWisePerformanceDto> subjectWiseRecords;
	private List<ClassWisePerformanceDto> classList;
	private List<SubjectMarkDto> subList;
	private List<SchoolPerformanceDto> schoolList;
}
