package com.spring.studentmarks.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.studentmarks.dto.RequestDTO;
import com.spring.studentmarks.dto.SchoolPerformanceDto;
import com.spring.studentmarks.service.StudentService;

@RestController
@RequestMapping("/details")
public class StudentController {

	//private static final StudentDto StudentDto = null;
	@Autowired
	private StudentService userService;

//	@PostMapping(value = "/save")
//	public ResponseEntity<StudentEntity> createStudent(@RequestBody StudentEntity student) {
//
//		userService.savestudent(student);
//		return ResponseEntity.ok(student);
//	}
	
	
	
	
	@GetMapping(value = "/get")
	private List<SchoolPerformanceDto> getSampleResponseFormat(RequestDTO request) {
		 
		
		return 	userService.getBySchool(request);
			
	}



	}
	
		 
	

			
		
	
	


