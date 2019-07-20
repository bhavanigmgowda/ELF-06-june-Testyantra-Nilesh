package com.tyss.emp.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyss.emp.dao.EmployeeDAO;
import com.tyss.emp.dto.EmployeeInfoBean;
import com.tyss.emp.dto.EmployeeOtherInfoBean;

@WebServlet("/registration")
public class EmployeeRegistrationServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

			EmployeeInfoBean bean = new EmployeeInfoBean();
			bean.setId(Integer.parseInt(req.getParameter("id")));
			bean.setName(req.getParameter("name"));
			bean.setAge(Integer.parseInt(req.getParameter("age")));
			bean.setPhone(Long.parseLong(req.getParameter("phone")));
			bean.setAccount_no(Long.parseLong(req.getParameter("accountNumber")));
			bean.setDesignation("designation");
			bean.setEmail("email");
			bean.setPassword("password");
			bean.setSalary(Double.parseDouble(req.getParameter("salary")));
			//bean.setManager_ID(Integer.parseInt(req.getParameter("managerid")));

			try {
				bean.setDob(dateFormat.parse(req.getParameter("dob")));
				bean.setJoining_date(dateFormat.parse(req.getParameter("dateofjoining")));
			} catch (ParseException e) {
				e.printStackTrace();
			}

			//bean.setD(Integer.parseInt(req.getParameter("deptid")));
			bean.setGender("gender");
   
			
			
			EmployeeOtherInfoBean otherInfoBean = new EmployeeOtherInfoBean();
			otherInfoBean.setAdhar(Long.parseLong(req.getParameter("aadhar")));
			otherInfoBean.setBlood_grp(req.getParameter("blood"));
			otherInfoBean.setChallenged(Boolean.parseBoolean(req.getParameter("challenged")));
			otherInfoBean.setEmergency_contact_number(Long.parseLong(req.getParameter("contactnumber")));
			otherInfoBean.setEmergency_contact_name(req.getParameter("contactname"));
			otherInfoBean.setFather_name(req.getParameter("fathername"));
			otherInfoBean.setMother_name(req.getParameter("mother"));
			otherInfoBean.setIsmarried(Boolean.parseBoolean(req.getParameter("ismarried")));
			otherInfoBean.setNationality(req.getParameter("nationality"));
			otherInfoBean.setSpouse_NM(req.getParameter("spousename"));
			otherInfoBean.setReligion(req.getParameter("religion"));
			otherInfoBean.setPassport(Long.parseLong(req.getParameter("passport")));
		//	otherInfoBean.setId(Integer.parseInt(req.getParameter("id")));
			otherInfoBean.setPan(req.getParameter("pan"));
			bean.setOtherInfo(otherInfoBean);
			
			
			
			
			EmployeeDAO dao = new EmployeeDAO();
			
			if (dao.CreateEmployeeinfo(bean)) {
				req.setAttribute("msg", "Registration is Successfull");
				req.getRequestDispatcher("/index.jsp").forward(req, resp);
			} else {
				req.setAttribute("msg", "Registration is Failed");
				req.getRequestDispatcher("/index.jsp").forward(req, resp);
			}
		} catch (NumberFormatException e) {
			req.setAttribute("msg", "Registration is Failed....Try Again !!!!");
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
		}

	}

}
