package com.tyss.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tyss.lms.dto.UserBean;


public interface UserRepository extends JpaRepository<UserBean ,Integer>  {

	/*
	 * @Query("Select e from UserBean e where e.infoBean=:id") 

	 *  public UserBean findByEmpId(@Param("id") UserBean id);
	 */
	
	  public UserBean findByName(String name);
	  
	  public boolean existsByName(String name);
}
