package com.tyss.bean;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeExperienceInfoBean {
	private int id ;         
	private String company_name;
	private String designation;
	private Date joining_Date;
	private Date leaving_Date;


}//end of class

