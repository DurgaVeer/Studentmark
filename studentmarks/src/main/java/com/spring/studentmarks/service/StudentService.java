package com.spring.studentmarks.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import java.util.Set;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.studentmarks.dto.RequestDTO;
import com.spring.studentmarks.dto.SchoolPerformanceDto;
import com.spring.studentmarks.dto.SubjectWisePerformanceDto;
import com.spring.studentmarks.entity.StudentEntity;
import com.spring.studentmarks.repository.StudentRepository;

@Service
@Transactional
public class StudentService {
	@Autowired
	private StudentRepository userRepository;

//	public void savestudent(StudentEntity student) {
//
//		student.getTotalMarks();
//		student.getPercentage();
//		student.setCreatedBy("Durga");
//
//		userRepository.save(student);
//	}

	private static final Integer SUBJECT_PASS_MARK = 35;



	public List<SchoolPerformanceDto>getBySchool (RequestDTO request) {
		List<SubjectWisePerformanceDto> subjectWiseRecords = new ArrayList<SubjectWisePerformanceDto>();
		SubjectWisePerformanceDto subjectWisePerformanceDTO = new SubjectWisePerformanceDto();
		
		
		subjectWisePerformanceDTO.setSubjectName(request.getTamil());
		subjectWisePerformanceDTO.setNoOfStudentAttempted(request.getSubjectWiseRecords());
		subjectWisePerformanceDTO.setNoOfPass(request.getSubjectWiseRecords());
		subjectWisePerformanceDTO.setNoOfFail(request.getSubjectWiseRecords());
		subjectWisePerformanceDTO.setPassPercentage(request.getClassList());
		subjectWisePerformanceDTO.setFailPercentage(request.getClassList());
		subjectWiseRecords.add(subjectWisePerformanceDTO);
		return userRepository.getBycreatedBy(request);
	}
	 
	
} 
//		List<SchoolPerformanceDto> schoolList = new ArrayList<SchoolPerformanceDto>();
//		
//
//		List<StudentEntity> studentMarkList = new ArrayList<StudentEntity>();
//
//		Map<String, Map<String, List<StudentEntity>>> schoolWiseClassWiseDataMap = new HashMap<String, Map<String, List<StudentEntity>>>();
//
//		for (StudentEntity studentEntity : studentMarkList) {
//
//			Map<String, List<StudentEntity>> classWiseDataMap = schoolWiseClassWiseDataMap
//					.get(studentEntity.getCreatedBy());
//
//			if (null == classWiseDataMap) {
//
//				classWiseDataMap = new HashMap<String, List<StudentEntity>>();
//
//				List<StudentEntity> studetMarkList = new ArrayList<StudentEntity>();
//
//				studetMarkList.add(studentEntity);
//
//				classWiseDataMap.put(studentEntity.getStuClass(), studetMarkList);
//
//			} else {
//
//				List<StudentEntity> studentMarkListTemp = classWiseDataMap.get(studentEntity.getStuClass());
//
//				if (null == studentMarkListTemp || studentMarkListTemp.isEmpty()) {
//					studentMarkListTemp = new ArrayList<StudentEntity>();
//				}
//				studentMarkListTemp.add(studentEntity);
//				classWiseDataMap.put(studentEntity.getStuClass(), studentMarkList);
//			}
//			schoolWiseClassWiseDataMap.put(studentEntity.getCreatedBy(), classWiseDataMap);
//		}
//
//		Set<String> schoolNameList = schoolWiseClassWiseDataMap.keySet();
//
//		for (String schoolName : schoolNameList) {
//
//			Map<String, List<StudentEntity>> classWiseDataMap = schoolWiseClassWiseDataMap.get(schoolName);
//
//			Integer schoolnoOfStudents = 0, schoolnoOfPass = 0, schoolnoOfFail = 0;
//			List<ClassWisePerformanceDto> classList = new ArrayList<ClassWisePerformanceDto>();
//
//			for (String className : classWiseDataMap.keySet()) {
//
//				List<StudentEntity> studentMarksList = classWiseDataMap.get(className);
//
//				Map<String, List<SubjectMarkDto>> subjectWiseMarkMap = new HashMap<>();
//
//				Integer classnoOfStudents = studentMarksList.size(), classnoOfPass = 0, classnoOfFail = 0;
//
//				for (StudentEntity studentMarkObj : studentMarksList) {
//
//					Boolean isCurrentStudentOverallPass = true;
//
//					List<SubjectMarkDto> tamilMarkList = subjectWiseMarkMap.get("TAMIL");
//					if (null == tamilMarkList)
//						tamilMarkList = new ArrayList<SubjectMarkDto>();
//
//					SubjectMarkDto subjectMarkDTO = new SubjectMarkDto();
//					subjectMarkDTO.setIsPass(studentMarkObj.getTamil() >= SUBJECT_PASS_MARK ? true : false);
//					subjectMarkDTO.setOptainedMark(studentMarkObj.getTamil());
//					tamilMarkList.add(subjectMarkDTO);
//					subjectWiseMarkMap.put("TAMIL", tamilMarkList);
//					if (!subjectMarkDTO.getIsPass()) {
//						isCurrentStudentOverallPass = false;
//					}
//
//					List<SubjectMarkDto> englishMarkList = subjectWiseMarkMap.get("ENGLISH");
//					if (null == englishMarkList)
//						englishMarkList = new ArrayList<SubjectMarkDto>();
//
//					SubjectMarkDto englishSubjectDTO = new SubjectMarkDto();
//					englishSubjectDTO.setIsPass(studentMarkObj.getEnglish() >= SUBJECT_PASS_MARK ? true : false);
//					englishSubjectDTO.setOptainedMark(studentMarkObj.getEnglish());
//					englishMarkList.add(englishSubjectDTO);
//					subjectWiseMarkMap.put("ENGLISH", englishMarkList);
//					if (!englishSubjectDTO.getIsPass()) {
//						isCurrentStudentOverallPass = false;
//					}
//
//					List<SubjectMarkDto> mathsMarkList = subjectWiseMarkMap.get("MATHS");
//					if (null == mathsMarkList)
//						mathsMarkList = new ArrayList<SubjectMarkDto>();
//
//					SubjectMarkDto mathsSubjectDTO = new SubjectMarkDto();
//					mathsSubjectDTO.setIsPass(studentMarkObj.getMaths() >= SUBJECT_PASS_MARK ? true : false);
//					mathsSubjectDTO.setOptainedMark(studentMarkObj.getMaths());
//					mathsMarkList.add(mathsSubjectDTO);
//					subjectWiseMarkMap.put("MATHS", mathsMarkList);
//					if (!mathsSubjectDTO.getIsPass()) {
//						isCurrentStudentOverallPass = false;
//					}
//
//					List<SubjectMarkDto> scienceMarkList = subjectWiseMarkMap.get("SCIENCE");
//					if (null == scienceMarkList)
//						scienceMarkList = new ArrayList<SubjectMarkDto>();
//
//					SubjectMarkDto scienceSubjectDTO = new SubjectMarkDto();
//					scienceSubjectDTO.setIsPass(studentMarkObj.getScience() >= SUBJECT_PASS_MARK ? true : false);
//					scienceSubjectDTO.setOptainedMark(studentMarkObj.getScience());
//					scienceMarkList.add(scienceSubjectDTO);
//					subjectWiseMarkMap.put("SCIENCE", scienceMarkList);
//					if (!scienceSubjectDTO.getIsPass()) {
//						isCurrentStudentOverallPass = false;
//					}
//
//					List<SubjectMarkDto> socialMarkList = subjectWiseMarkMap.get("SOCIAL SCIENCE");
//					if (null == socialMarkList)
//						scienceMarkList = new ArrayList<SubjectMarkDto>();
//
//					SubjectMarkDto socialSubjectDTO = new SubjectMarkDto();
//					socialSubjectDTO.setIsPass(studentMarkObj.getSocialScience() >= SUBJECT_PASS_MARK ? true : false);
//					socialSubjectDTO.setOptainedMark(studentMarkObj.getSocialScience());
//					socialMarkList.add(socialSubjectDTO);
//					subjectWiseMarkMap.put("SOCIAL SCIENCE", socialMarkList);
//					if (!socialSubjectDTO.getIsPass()) {
//						isCurrentStudentOverallPass = false;
//					}
//
//					if (isCurrentStudentOverallPass) {
//						classnoOfPass++;
//					} else {
//						classnoOfFail++;
//					}
//				}
//
//				Double classpassPercentage = (double) ((classnoOfPass * 100) / classnoOfStudents);
//				Double classfailPercentage = 100.00 - classpassPercentage;
//
//				List<SubjectWisePerformanceDto> studentsubjectWiseRecords = new ArrayList<SubjectWisePerformanceDto>();
//
//				for (String subjectName : subjectWiseMarkMap.keySet()) {
//
//					List<SubjectMarkDto> subjectWiseMarkList = subjectWiseMarkMap.get(subjectName);
//
//					Long totalNoOfPassStudents = subjectWiseMarkList.stream().filter(obj -> obj.getIsPass())
//							.collect(Collectors.counting());
//					SubjectWisePerformanceDto subjectWisePerformanceDTO = new SubjectWisePerformanceDto();
//					subjectWisePerformanceDTO.setSubjectName(subjectName);
//					subjectWisePerformanceDTO.setNoOfStudentAttempted(subjectWiseMarkList.size());
//					subjectWisePerformanceDTO.setNoOfPass(totalNoOfPassStudents.intValue());
//					subjectWisePerformanceDTO
//							.setNoOfFail(subjectWiseMarkList.size() - totalNoOfPassStudents.intValue());
//					Double passPercentage = (double) ((subjectWisePerformanceDTO.getNoOfPass() * 100)
//							/ subjectWisePerformanceDTO.getNoOfStudentAttempted());
//					subjectWisePerformanceDTO.setPassPercentage(passPercentage);
//					subjectWisePerformanceDTO.setFailPercentage(100.00 - passPercentage);
//					studentsubjectWiseRecords.add(subjectWisePerformanceDTO);
//				}
//
//				ClassWisePerformanceDto classWisePerformanceDTO = new ClassWisePerformanceDto();
//				classWisePerformanceDTO.setClassName(className);
//				classWisePerformanceDTO.setNoOfStudents(classnoOfStudents);
//				classWisePerformanceDTO.setNoOfPass(classnoOfPass);
//				classWisePerformanceDTO.setNoOfFail(classnoOfFail);
//				classWisePerformanceDTO.setPassPercentage(classpassPercentage);
//				classWisePerformanceDTO.setFailPercentage(classfailPercentage);
//				classWisePerformanceDTO.setSubjectWiseRecords(studentsubjectWiseRecords);
//				classList.add(classWisePerformanceDTO);
//
//				schoolnoOfStudents = schoolnoOfStudents + classnoOfStudents;
//
//				schoolnoOfPass = schoolnoOfPass + classnoOfPass;
//
//				schoolnoOfFail = schoolnoOfFail + classnoOfFail;
//			}
//
//			Double schoolpassPercentage = (double) ((schoolnoOfPass * 100) / schoolnoOfStudents);
//			Double schoolfailPercentage = 100.00 - schoolpassPercentage;
//
//			SchoolPerformanceDto schoolPerformaceObj = new SchoolPerformanceDto();
//			schoolPerformaceObj.setSchool(schoolName);
//			;
//			schoolPerformaceObj.setNoOfStudents(schoolnoOfStudents);
//			schoolPerformaceObj.setNoOfPass(schoolnoOfPass);
//			schoolPerformaceObj.setNoOfFail(schoolnoOfFail);
//			schoolPerformaceObj.setPassPercentage(schoolfailPercentage);
//			schoolPerformaceObj.setFailPercentage(schoolfailPercentage);
//			schoolPerformaceObj.setClassList(classList);
//			schoolList.add(schoolPerformaceObj);
//
//		}
//
//		 userRepository.findAll(schoolList);
//		 return schoolList;
//
//	}
//
//	// return schoolList;
//
//}
