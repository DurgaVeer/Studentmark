package com.spring.studentmarks.repository;

import java.util.List;
import java.util.UUID;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.spring.studentmarks.dto.RequestDTO;
import com.spring.studentmarks.dto.SchoolPerformanceDto;
//import com.spring.studentmarks.dto.StudentDto;
import com.spring.studentmarks.entity.StudentEntity;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity,UUID>{

	



//	List<SchoolPerformanceDto> createdBy(RequestDTO request);

	List<SchoolPerformanceDto> getBycreatedBy(RequestDTO request);

	

//	List<SchoolPerformanceDto> findAllBycreatedBy(List<SchoolPerformanceDto> schoolList);

	

	



	



	//List<SchoolPerformanceDto> findAll(List<SchoolPerformanceDto> schoolList);

	
	

}