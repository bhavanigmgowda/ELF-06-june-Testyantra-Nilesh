package com.tyss.bean;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeEducationalInfoBean {
	private int id;           
	private String educational_Type;
	private String degree_Type;	
	private String branch;			 
	private String college_Name;    
	private String university;      
	private Double percentage;      
	private String location;		
	private Date yop;             


}//end of class

