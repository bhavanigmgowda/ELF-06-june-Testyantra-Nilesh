package com.tyss.hibernateassesment.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="student")
public class StudentDTO {
       @Id
	   @Column(name="firstName")
	   private String firstName;
	   @Column(name="lastname")
	   private String lastname;
	   @Column(name="subject")
	   private String subject;
	   @Column(name="totalMarks")
	   private double totalMarks;
	
}
