package com.tyss.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.lms.dto.IssuedBookBean;
import com.tyss.lms.dto.RequestBean;
import com.tyss.lms.dto.ResponseData;
import com.tyss.lms.repository.RequestBookRespository;
@CrossOrigin(origins ="http://localhost:3000")
@RestController
public class ReqestBookController {

	     @Autowired
    	 RequestBookRespository requestBookRepository;
	     
	     @GetMapping(path = "/getRequest", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	     public ResponseData getRequest() {
	    	 ResponseData responseData = new ResponseData();
	    	 if(requestBookRepository.findAll().size()!=0) {
				   
				   responseData.setCode(201);
	    		   responseData.setMsg("Successsfull");
	    		   responseData.setDescription("All Book Data is found");
	    		   responseData.setRequestList(requestBookRepository.findAll());
				   
			   }
			   else {
				   responseData.setCode(2401);
	    		   responseData.setMsg("failed");
	    		   responseData.setDescription(" Book Data is not found");
				   
			   }
	    	 return responseData;
	     }

	     @PostMapping(path = "/getRequestfromUser", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	 	public ResponseData allocatedBook(@RequestBody RequestBean requestBean) {
	 		ResponseData responseData = new ResponseData();
	 		
	 		if (requestBean != null) {
	 			requestBookRepository.flush();
	 			requestBookRepository.save(requestBean);
	 			responseData.setCode(201);
	 			responseData.setMsg("Successsfull");
	 			responseData.setDescription("request is saved");
	 		} else {
	 			responseData.setCode(401);
	 			responseData.setMsg("failed");
	 			responseData.setDescription(" Request is not saved");
	 		}

	 		return responseData;

	 	}
}
