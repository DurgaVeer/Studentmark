package com.spring.studentmarks.entity;


import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


@Entity
@Table(name = "student")
public class StudentEntity {

	@Id

	@GeneratedValue(generator = "UUID")

	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")

	@Type(type = "uuid-char")

	@Column(name = "id", updatable = false, nullable = false)

	private UUID id;

	
	@Column(name = "stud_name")
     private String name;

	@Column(name = "stud_roll_num")
     private int rollNo;

	@Column(name = "stud_class")
     private String stuClass;

	@Column(name = "sub_tamil_mark")
    private int tamil;

	@Column(name = "sub_eng_mark")
    private int english;

	@Column(name = "sub_math_mark")
     private int maths;

	@Column(name = "sub_science_mark")
     private int science;

	@Column(name = "sub_social_mark")
     private int socialScience;

	@Column(name = "stud_total_mark")
      private double totalMarks;

	@Column(name = "percentage")
    private double percentage;
	
	@Column(name = "created_by")

	private String createdBy;
	
	

	
}