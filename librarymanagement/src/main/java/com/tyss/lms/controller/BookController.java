package com.tyss.lms.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.lms.dto.BookBean;
import com.tyss.lms.dto.ResponseData;
import com.tyss.lms.repository.BookRepository;
@CrossOrigin(origins ="http://localhost:3000")
@RestController
public class BookController {
	
	@Autowired
	BookRepository bookRepository;
	 
	 @GetMapping(path ="/getAllBook",produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseData getAllBook() {
		 ResponseData responseData=new ResponseData();
		   if(bookRepository.findAll().size()!=0) {
			   
			   responseData.setCode(201);
    		   responseData.setMsg("Successsfull");
    		   responseData.setDescription("All Book Data is found");
    		   responseData.setBookList(bookRepository.findAll());
			   
		   }
		   else {
			   responseData.setCode(2401);
    		   responseData.setMsg("failed");
    		   responseData.setDescription(" Book Data is not found");
			   
		   }
		 
		 return responseData;
	 }
	 
	 
	 @GetMapping(path ="/getBookByName",produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseData getBookByName(@RequestParam("BookName")String bookName) {
		 ResponseData responseData=new ResponseData();
		   if(bookRepository.findByBookname(bookName)!=null) {
			   
			   responseData.setCode(201);
    		   responseData.setMsg("Successsfull");
    		   responseData.setDescription(" Book Data is found");
    		   responseData.setBookList(Arrays.asList(bookRepository.findByBookname(bookName)));
			   
		   }
		   else {
			   responseData.setCode(401);
    		   responseData.setMsg("failed");
    		   responseData.setDescription(" Book Data is not found");
			   
		   }
		 
		 return responseData;
	 }
	 
	 @GetMapping(path ="/getBookByAuthor",produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseData getBookByAuthor(@RequestParam("Author")String author) {
		 ResponseData responseData=new ResponseData();
		   if(bookRepository.findByBookAuthor(author)!=null) {
			   
			   responseData.setCode(201);
    		   responseData.setMsg("Successsfull");
    		   responseData.setDescription(" Book Data is found");
    		   responseData.setBookList(Arrays.asList(bookRepository.findByBookAuthor(author)));
			   
		   }
		   else {
			   responseData.setCode(401);
    		   responseData.setMsg("failed");
    		   responseData.setDescription(" Book Data is not found");
			   
		   }
		 
		 return responseData;
	 }
	 
	 @GetMapping(path ="/getBookByCategory",produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseData getBookBy(@RequestParam("Category")String category) {
		 ResponseData responseData=new ResponseData();
		   if(bookRepository.findByBookCategeory(category)!=null) {
			   
			   responseData.setCode(201);
    		   responseData.setMsg("Successsfull");
    		   responseData.setDescription(" Book Data is found");
    		   responseData.setBookList(Arrays.asList(bookRepository.findByBookCategeory(category)));
			   
		   }
		   else {
			   responseData.setCode(401);
    		   responseData.setMsg("failed");
    		   responseData.setDescription(" Book Data is not found");
			   
		   }
		 
		 return responseData;
	 }
	 
	 
	 @PostMapping(path ="/InsertBook",produces = MediaType.APPLICATION_JSON_VALUE,consumes =MediaType.APPLICATION_JSON_VALUE )
	 public ResponseData InsertBook(@RequestBody BookBean bookBean) {
		 ResponseData responseData =new ResponseData();
		  if(!bookRepository.existsById(bookBean.getBookid())){
			  bookRepository.save(bookBean);
			  responseData.setCode(201); 
   		   responseData.setMsg("Successsfull");
   		   responseData.setDescription("Book Data is Inserted");
			   
		   }
		   else {
			   responseData.setCode(401);
   		   responseData.setMsg("failed");
   		   responseData.setDescription(" Book Data is not Inserted");
			   
		   }
		  return responseData;
	 }
	 @PostMapping(path ="/deleteBook",produces = MediaType.APPLICATION_JSON_VALUE) 
	 public ResponseData deleteBook(int id) {
		 ResponseData responseData =new ResponseData();
		  if(!bookRepository.existsById(id)){
		   bookRepository.deleteById(id);  
		   responseData.setCode(201);
  		   responseData.setMsg("Successsfull");
  		   responseData.setDescription("Book is deleted");
 
		   }
		   else {
			   responseData.setCode(2401);
  		   responseData.setMsg("failed");
  		   responseData.setDescription(" Book is not deleted");
			   
		   }
		  return responseData;
		 
	 }

}
