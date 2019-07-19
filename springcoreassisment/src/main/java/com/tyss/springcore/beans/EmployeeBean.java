package com.tyss.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *   Spring Phases
 */
import lombok.extern.java.Log;

@Log
public class EmployeeBean // implements InitializingBean,DisposableBean
{
	String name;
	int age;
 
	@Autowired   // annotation Autowiring
 
     @Qualifier("testing")	
	Department department;

	
	/*  Constructor
	 * 
	 * public EmployeeBean(String name, int age, Department department) { super();
	 * this.name = name; this.age = age; this.department = department; }
	 */
	
	
	// getter and setter

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// method

	public void init() throws Exception {
		log.info("\n Initialization phase");
	}

	public void destroy() throws Exception {
		log.info("Destroy phase");
	}

}// End of Class
