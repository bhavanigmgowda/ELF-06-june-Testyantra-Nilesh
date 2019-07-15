package com.tyss.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/readCookies")
public class ReadCookiesServlets extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// get cookies

		Cookie[] reciveCookies = req.getCookies();

		PrintWriter out = resp.getWriter();

		if (reciveCookies == null) {
			out.println("cookies are not present ");
		} else {
			out.println("cookies are  present ");

			for (Cookie cookie : reciveCookies) {
				out.println("cookies Name :" + cookie.getName());
				out.println("cookies Name :" + cookie.getValue());
			} // end of for
		} // end of if-else

	}// end of get

}// end of class
