package com.tyss.hibernateassesment.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="StudentOtherInfo")
public class StudentOtherInfo {
	 
	private int rollNum;
	private String fatherName;
	private String motherName;   
	private String religion;     
	private String nationality;   

}
