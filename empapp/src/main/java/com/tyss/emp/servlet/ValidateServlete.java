package com.tyss.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dom4j.bean.BeanAttribute;

import com.tyss.emp.dao.EmployeeDAO;
import com.tyss.emp.dto.EmployeeInfoBean;

@WebServlet("/login")
public class ValidateServlete extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EmployeeDAO dao = new EmployeeDAO();
		EmployeeInfoBean result = dao.validateUser(req.getParameter("id"), req.getParameter("password"));
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		if (req.getCookies() == null) {
			out.print("<H3><span style=text-align: center;\"color:red\">Please Enable your cookies</span></H3>");
			req.getRequestDispatcher("index.jsp").include(req, resp);
			return;
		}

		if (result != null) {
			HttpSession session = req.getSession(true);

			session.setAttribute("data", result);
			Cookie ck = new Cookie("JSESSIONID", session.getId());
			ck.setMaxAge(7 * 24 * 60 * 60);
			resp.addCookie(ck);
			String url = "home.jsp";
			RequestDispatcher dispatcher = req.getRequestDispatcher(url);
			dispatcher.forward(req, resp);

		} else {
			/*
			 * RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
			 * dispatcher.include(req, resp); out.
			 * print("<H3><span style=text-align: center;\"color:red\">Invalid Username OR password!!! </span></H3>"
			 * );
			 */
			req.setAttribute("msg","Invalid Username or Password");
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
			

		}

	}
}
