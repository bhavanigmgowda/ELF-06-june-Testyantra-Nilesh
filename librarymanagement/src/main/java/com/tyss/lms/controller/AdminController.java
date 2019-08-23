package com.tyss.lms.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.lms.dto.ResponseData;
import com.tyss.lms.dto.UserBean;
import com.tyss.lms.repository.UserRepository;
@CrossOrigin(origins ="http://localhost:3000")
@RestController
public class AdminController {
     
	@Autowired
	UserRepository repository;
	
	 @PostMapping(path ="/createUser",produces = MediaType.APPLICATION_JSON_VALUE,consumes =MediaType.APPLICATION_JSON_VALUE )
	public ResponseData createUser(@RequestBody UserBean userBean,HttpServletRequest request) {
		
		 ResponseData responseData=new ResponseData();
		   
		   if(!repository.existsById(userBean.getId())) {
			   
			   repository.save(userBean);
			   
			   responseData.setCode(201);
    		   responseData.setMsg("Successsfull");
    		   responseData.setDescription("Data is  Succesfully Added");
		   }
		   else {
			   responseData.setCode(401);
    		   responseData.setMsg("Successsfull");
    		   responseData.setDescription("Data is not Added");
			   
		   }
		  
		 return responseData;
	}
	 
	 @GetMapping(path ="/getAllUser",produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseData getAllUser() {
		 
		 ResponseData responseData=new ResponseData();
		    if(repository.findAll().size()!=0) {
		    responseData.setCode(201);
		    responseData.setMsg("Successsfull");
		    responseData.setDescription("Data is  found");
		    responseData.setUserList(repository.findAll());
		    }
		    else{
		    	   responseData.setCode(401);
				    responseData.setMsg("Failed");
				    responseData.setDescription("Data is  not found");
		    }
		    return responseData;
	   }
	 
	 
	 @GetMapping(path ="/getUserByName",produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseData getUserByName(String name) {
		 ResponseData responseData=new ResponseData();
		   if(repository.existsByName(name)) {
			   responseData.setCode(201);
			    responseData.setMsg("Successsfull");
			    responseData.setDescription("Data is  found");
			    responseData.setUserList(Arrays.asList(repository.findByName(name)));
		   }
		   else {
			   responseData.setCode(401);
			    responseData.setMsg("Failed");
			    responseData.setDescription("Data is  not found");
		   }
		 
		 return responseData;
	 }
	 
	 @GetMapping(path="/deleteUser",produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseData deleteUser(int id) {
		 ResponseData responseData=new ResponseData();
		   if(repository.existsById(id)) {
			   repository.deleteById(id);
			   responseData.setCode(201);
			    responseData.setMsg("Successsfull");
			    responseData.setDescription("User data deleted");
			
		   }
		   else {
			   responseData.setCode(401);
			    responseData.setMsg("failed");
			    responseData.setDescription("Data is not deleted");
			   
		   }
		   return responseData;
	 }
	 
	 
}
