package com.tyss.springboot.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.springboot.dto.EmployeeAddressInfo;
import com.tyss.springboot.dto.EmployeeEducationInfo;
import com.tyss.springboot.dto.EmployeeExperienceInfo;
import com.tyss.springboot.dto.EmployeeInfoBean;
import com.tyss.springboot.dto.EmployeeResponse;
import com.tyss.springboot.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;

	@GetMapping(path = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
	public String helloWorld() {
		return "HelloWorld";
	}

	@PostMapping(path ="/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse createEmployee(@RequestBody EmployeeInfoBean bean) {
		EmployeeResponse response = new EmployeeResponse();

		
        //check id is present or not
		if (!repository.existsById(bean.getId())) {

			// set Id
			bean.getOtherInfo().setInfoBean(bean);

			for (EmployeeAddressInfo addressInfo : bean.getAddressInfoBean()) {
				addressInfo.getAddressPkBean().setInfoBean(bean);
			}

			for (EmployeeEducationInfo educationInfo : bean.getEducationalInfoBeans()) {
				educationInfo.getEducationInfoPKBean().setInfoBean(bean);
			}

			for (EmployeeExperienceInfo experienceInfo : bean.getExpInfoBean()) {
				experienceInfo.getEmployeeExperiencePKBean().setInfoBean(bean);
			}

			EmployeeInfoBean manager = bean.getManagerId(); // create bean obj
			manager = repository.findById(manager.getId()).get(); // store manager in bean
			
			
			
			
			
			
			
			bean.setManagerId(manager); // set Manager id

			repository.save(bean);

			response.setStatusCode(201);
			response.setMessage("Successfull");
			response.setDescription("Employee Data successfully Added");
		} else {
			response.setStatusCode(401);
			response.setMessage("failed");
			response.setDescription("Employee Data Not Added to DB");
		}
		return response;

	}// end of createEmployee

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(int id) {
		
		EmployeeResponse response = new EmployeeResponse();

		if (repository.existsById(id)) {
			EmployeeInfoBean bean = repository.findById(id).get();
			response.setStatusCode(201);
			response.setMessage("Successfull");
			response.setDescription("Employee Data Found successfully");
			response.setBean(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMessage("failed");
			response.setDescription("Employee Data not Found");
		}

		return response;
	} // end of getEmployee

	@GetMapping(path = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(int id) {
		EmployeeResponse response = new EmployeeResponse();
		EmployeeInfoBean bean = repository.findById(id).get();

		if (bean != null) {
			repository.delete(bean);
			response.setStatusCode(201);
			response.setMessage("Successfull");
			response.setDescription("Employee delete Successfully");

		} else {
			response.setStatusCode(401);
			response.setMessage("failed");
			response.setDescription("Employee id not found");
		}
		return response;
	}
	@PostMapping(path = "/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean bean) {
		EmployeeResponse response = new EmployeeResponse();

		if (repository.existsById(bean.getId())) {

			bean.getOtherInfo().setInfoBean(bean);

			for (EmployeeAddressInfo addressInfo : bean.getAddressInfoBean()) {
				addressInfo.getAddressPkBean().setInfoBean(bean);
			}

			for (EmployeeEducationInfo educationInfo : bean.getEducationalInfoBeans()) {
				educationInfo.getEducationInfoPKBean().setInfoBean(bean);
			}

			for (EmployeeExperienceInfo experienceInfo : bean.getExpInfoBean()) {
				experienceInfo.getEmployeeExperiencePKBean().setInfoBean(bean);
			}

			EmployeeInfoBean manager = bean.getManagerId(); // create bean obj
			manager = repository.findById(manager.getId()).get(); // store manager in bean
			bean.setManagerId(manager); // set Manager id

			repository.save(bean);
			response.setStatusCode(201);
			response.setMessage("Successfull");
			response.setDescription("Employee Data update successfully");

		} else {
			response.setStatusCode(401);
			response.setMessage("failed");
			response.setDescription("Employee is not present");

		}

		return response;
	}

}// End of class+
