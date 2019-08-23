package com.tyss.lms.controller;

import java.util.Arrays;

import javax.persistence.Column;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.lms.dto.ResponseData;
import com.tyss.lms.dto.UserBean;
import com.tyss.lms.repository.UserRepository;
@CrossOrigin(origins ="http://localhost:3000")
@RestController
public class LoginController {
	@Autowired
	UserRepository repository;
	
      @PostMapping(path ="/login")
	  public ResponseData login( int id,String password,HttpServletRequest request) {
		  
    	  UserBean userBean=repository.findById(id).get();
    	  ResponseData responseData=new ResponseData();
    	   if(id==userBean.getId() && password.equals(userBean.getPassword())		    ) {
    		   
    		   responseData.setCode(201);
    		   responseData.setMsg("Successsfull");
    		   responseData.setDescription("Login Succesfully");
    		   responseData.setUserList(Arrays.asList(userBean));
    		   request.getSession().setAttribute("Userbean",userBean);
 	    }
    	   else {
    		   responseData.setCode(401);
    		   responseData.setMsg("failed");
    		   responseData.setDescription("Invalid Credientials");  
    	   }
    	  
    	  return responseData;
	  }
      
      
}
