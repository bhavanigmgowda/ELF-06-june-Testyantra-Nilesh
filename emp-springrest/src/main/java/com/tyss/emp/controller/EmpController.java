package com.tyss.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.emp.common.EmpConstant;
import com.tyss.emp.common.EmployeeResponse;
import com.tyss.emp.dao.EmployeeDAO;
import com.tyss.emp.dao.EmployeeDAOHibernateImpl;
import com.tyss.emp.dto.EmployeeAddressInfo;
import com.tyss.emp.dto.EmployeeEducationInfo;
import com.tyss.emp.dto.EmployeeExperienceInfo;
import com.tyss.emp.dto.EmployeeInfoBean;
import com.tyss.emp.dto.EmployeeOtherInfoBean;

//@Controller
@RestController
@RequestMapping("/"
		+ "")
public class EmpController {

	EmployeeDAO dao = new EmployeeDAOHibernateImpl();
	// binder Date
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("dd-MM-yyyy"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

	// no need of @ResponseBody in the method when use @@RestController

	@GetMapping(value = "/getEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id") int id, HttpServletRequest request) {

		EmployeeResponse response = new EmployeeResponse();
		if (request.getSession(false) != null) {
			EmployeeInfoBean bean = dao.getEmployee(id);
			if (bean != null) {
				response.setStatusCode(201);
				response.setMsg("Succesfull");
				response.setDescription("Employee data found Successfully");
				response.setBean(Arrays.asList(bean));
			} else {

				response.setStatusCode(401);
				response.setMsg("failure");
				response.setDescription("Employee data not found");
			}
			return response;
		} else {
			response.setStatusCode(501);
			response.setMsg("failure");
			response.setDescription("Please Login First");
			return response;

		}
	}// End OF getEmployee

	@DeleteMapping(value = "/deleteEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@RequestParam("id") int id, HttpServletRequest request) {

		EmployeeResponse response = new EmployeeResponse();
		if (request.getSession(false) != null) {
			if (dao.deleteEmployeeinfo(id)) {
				response.setStatusCode(201);
				response.setMsg("Succesfull");
				response.setDescription("Employee deleted Successfully");
			} else {

				response.setStatusCode(401);
				response.setMsg("failure");
				response.setDescription("Employee does not deleted");
			}

			return response;
		} else {
			response.setStatusCode(501);
			response.setMsg("failure");
			response.setDescription("Please Login First");
			return response;
		}
	}

	@PostMapping(value = "/createEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse createEmployee(@RequestBody EmployeeInfoBean bean) {

		EmployeeResponse response = new EmployeeResponse();

		if (dao.createEmployeeinfo(bean)) {
			response.setStatusCode(201);
			response.setMsg("Succesfull");
			response.setDescription("Employee Added Successfully");
		} else {

			response.setStatusCode(401);
			response.setMsg("failure");
			response.setDescription("Employee does not inserted");
		}

		return response;
	}// end of create

	@PutMapping(value = "/updateEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean bean, HttpServletRequest request) {

		EmployeeResponse response = new EmployeeResponse();
		if (request.getSession(false) != null) {
			if (dao.updateEmployeeinfo(bean)) {
				response.setStatusCode(201);
				response.setMsg("Succesfull");
				response.setDescription("Employee update Successfully");
			} else {

				response.setStatusCode(401);
				response.setMsg("failure");
				response.setDescription("Employee does not Updated");
			}

			return response;
		} else {
			response.setStatusCode(501);
			response.setMsg("failure");
			response.setDescription("Please Login First");
			return response;

		}
	}// End OF update

	@GetMapping(value = "/getAllEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee(HttpServletRequest request) {
		EmployeeResponse response = new EmployeeResponse();
		if (request.getSession(false) != null) {

			List<EmployeeInfoBean> allBean = dao.getAllEmployee();

			if (allBean != null) {
				response.setStatusCode(201);
				response.setMsg("Succesfull");
				response.setDescription("All Employee Data Successfully");
				response.setBean((allBean)); // directly set allBean- is list no need Arrays.asList()
			} else {

				response.setStatusCode(401);
				response.setMsg("failure");
				response.setDescription("Employee does not Found");
			}

			return response;
		} else {
			response.setStatusCode(501);
			response.setMsg("failure");
			response.setDescription("Please Login First");
			return response;
		}
	}
}// End of Controller
