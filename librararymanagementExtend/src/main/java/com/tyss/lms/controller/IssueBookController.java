package com.tyss.lms.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tyss.lms.dto.IssuedBookBean;
import com.tyss.lms.dto.ResponseData;
import com.tyss.lms.repository.IssueRepository;
@CrossOrigin(origins ="http://localhost:3000")
public class IssueBookController {

	@Autowired
	IssueRepository issueRepositpory;
	
	// binder Date
		@InitBinder
		public void initBinder(WebDataBinder binder) {
			CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("dd-MM-yyyy"), true);
			binder.registerCustomEditor(Date.class, editor);
		}
	
	

	@PostMapping(path = "/AllocateBook", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseData allocatedBook(@RequestBody IssuedBookBean issuedBookBean) {
		ResponseData responseData = new ResponseData();
		if (issuedBookBean != null) {
			issueRepositpory.save(issuedBookBean);
			responseData.setCode(201);
			responseData.setMsg("Successsfull");
			responseData.setDescription("Book is issued");
		} else {
			responseData.setCode(401);
			responseData.setMsg("failed");
			responseData.setDescription(" Book is not issued");
		}

		return responseData;

	}
}
