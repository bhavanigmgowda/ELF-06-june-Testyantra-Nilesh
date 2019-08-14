package com.tyss.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
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

import com.tyss.emp.common.EmpConstant;
import com.tyss.emp.dao.EmployeeDAO;
import com.tyss.emp.dao.EmployeeDAOHibernateImpl;
import com.tyss.emp.dto.EmployeeAddressInfo;
import com.tyss.emp.dto.EmployeeEducationInfo;
import com.tyss.emp.dto.EmployeeExperienceInfo;
import com.tyss.emp.dto.EmployeeInfoBean;
import com.tyss.emp.dto.EmployeeOtherInfoBean;

@Controller
@RequestMapping("/employeeRest")
public class EmpController {

	EmployeeDAO dao = new EmployeeDAOHibernateImpl();

	// binder Date
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("dd-MM-yyyy"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@GetMapping("/getEmployee")
	public @ResponseBody EmployeeInfoBean getEmployee(@RequestParam("id") int id) {
		return dao.getEmployee(id);
	}// End OF getEmployee

	@DeleteMapping("/deleteEmployee")
	public @ResponseBody boolean deleteEmployee(@RequestParam("id") int id) {
		return dao.deleteEmployeeinfo(2);

	}

	@PostMapping("/createEmployee")
	public @ResponseBody boolean createEmployee(@RequestBody EmployeeInfoBean bean) {

		
	

		List<EmployeeEducationInfo> eduBean = bean.getEducationalInfoBeans();

         // set id for education
		for (EmployeeEducationInfo employeeEducationInfo : eduBean) {
			employeeEducationInfo.getEducationInfoPKBean().setInfoBean(bean);
		}
		// set id for Address
		List<EmployeeAddressInfo> addressInfos = bean.getAddressInfoBean();
		for (EmployeeAddressInfo employeeAddressInfo : addressInfos) {
			employeeAddressInfo.getAddressPkBean().setInfoBean(bean);
		}
       // set id for Experience
		List<EmployeeExperienceInfo> experienceInfos = bean.getExpInfoBean();
		for (EmployeeExperienceInfo employeeExperienceInfo : experienceInfos) {
			employeeExperienceInfo.getEmployeeExperiencePKBean().setInfoBean(bean);
		}

		EmployeeOtherInfoBean otherInfoBean = bean.getOtherInfo();
		otherInfoBean.setInfoBean(bean);

		return dao.createEmployeeinfo(bean);
	}

	@PutMapping("/updateEmployee")
	public @ResponseBody boolean updateEmployee(@RequestBody EmployeeInfoBean bean) {
		return dao.updateEmployeeinfo(bean);
	}// End OF update


	@GetMapping(value = "/getAllEmployee",produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<EmployeeInfoBean> getAllEmployee() {
		return dao.getAllEmployee();
	}
}// End of Controller
