package com.tyss.lms.dto;

import java.util.List;

import lombok.Data;

@Data
public class ResponseData {
	

	  private int code;
	  private String msg;
	  private String description;
	  private List<BookBean> bookList;
	  private List <UserBean> userList;
	  private List <IssuedBookBean> issueBookList;
	  private List<BookStatusBean> bookstatusList;
	  private List<RequestBean> requestList;
}
