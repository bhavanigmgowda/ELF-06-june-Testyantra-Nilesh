package com.tyss.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookies")
public class CreateCookiesServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// create cookies
		Cookie mynameCookie = new Cookie("myName", "Nilesh");
		Cookie myLocationCookie = new Cookie("city", "banglore");
		myLocationCookie.setMaxAge(7*24*60*60);  // time in sec

		// send above cookies to browser
		resp.addCookie(mynameCookie);
		resp.addCookie(myLocationCookie);

		PrintWriter out = resp.getWriter();
		out.println("Created the cookie!!.....!!!!");

	}// end of method

}// end of class
