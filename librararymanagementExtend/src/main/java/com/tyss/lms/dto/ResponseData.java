package com.tyss.lms.dto;

import java.util.List;

import lombok.Data;

@Data
public class ResponseData {

	private int code;
	private String msg;
	private String description;
	private List<BookBean> bookList;
	private List<UserBean> userList;
	private List<IssuedBookBean> issueBookList;
	private List<BookStatusBean> bookstatusList;
	private List<RequestBean> requestList;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<BookBean> getBookList() {
		return bookList;
	}

	public void setBookList(List<BookBean> bookList) {
		this.bookList = bookList;
	}

	public List<UserBean> getUserList() {
		return userList;
	}

	public void setUserList(List<UserBean> userList) {
		this.userList = userList;
	}

	public List<IssuedBookBean> getIssueBookList() {
		return issueBookList;
	}

	public void setIssueBookList(List<IssuedBookBean> issueBookList) {
		this.issueBookList = issueBookList;
	}

	public List<BookStatusBean> getBookstatusList() {
		return bookstatusList;
	}

	public void setBookstatusList(List<BookStatusBean> bookstatusList) {
		this.bookstatusList = bookstatusList;
	}

	public List<RequestBean> getRequestList() {
		return requestList;
	}

	public void setRequestList(List<RequestBean> requestList) {
		this.requestList = requestList;
	}

}
