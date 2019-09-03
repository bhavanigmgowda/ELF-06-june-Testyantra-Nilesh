package com.taskmanagement.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanagement.dto.CreateTaskBean;
import com.taskmanagement.repo.TaskRepository;
import com.taskmanagement.repo.UserRepository;
import com.taskmanagement.response.Response;

import lombok.extern.java.Log;

@RestController
public class TaskController {

	@Autowired
	TaskRepository taskRepository;
	@Autowired
	UserRepository userRepository;

	// get all task assigned to others todo
	@GetMapping(path = "/getAssignToTask", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Response getAssignToTask(@RequestParam("email") String email, HttpServletRequest req) {

		Response response = new Response();
		if (req.getSession(false) != null) {

			if (userRepository.existsByEmail(email)) {
				response.setStatusCode(201);
				response.setMessage("Success");
				response.setDescription("All Task data Assigned Found Successfully");
				response.setTaskBean(taskRepository.getAssignTo(email));

			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Task data not found");

			} // End of getAssignToTask()
		} else {
			response.setStatusCode(501);
			response.setMessage("Login Failure");
			response.setDescription("LoginFirst");

		}
		return response;
	}

	// get all task Assigned To you
	@GetMapping(path = "/getAssignedTask", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Response getAssignedTask(@RequestParam("email") String email, HttpServletRequest req) {

		Response response = new Response();
		if (req.getSession(false) != null) {
			if (userRepository.existsByEmail(email)) {

				response.setStatusCode(201);
				response.setMessage("Success");
				response.setDescription("All Task data Assigned Found Successfully");
				response.setTaskBean(taskRepository.getAssignedTask(email));

			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Task data not found");
			}
		} else {
			response.setStatusCode(501);
			response.setMessage("Login Failure");
			response.setDescription("LoginFirst");
		}
		return response;
	} // End of getAssignedTask()

	@PostMapping(value = "/createTask", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response createTask(@RequestBody CreateTaskBean task) {
		Response response = new Response();
		if (userRepository.existsById(task.getUserBean().getEmpId())) {

			taskRepository.save(task);
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Task added successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("user id does not exist ");
		}
		return response;

	}// End of createTask()

	@GetMapping(path = "/getAllTask", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Response getAllTask(HttpServletRequest req) {

		Response response = new Response();
		if (req.getSession(false) != null) {
			if (taskRepository.findAll() != null) {
				response.setStatusCode(201);
				response.setMessage("Success");
				response.setDescription("Task data found successfully");
				response.setTaskBean(taskRepository.findAll());

				return response;
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Task data not found");
			}
		} else {
			response.setStatusCode(501);
			response.setMessage("Login Failure");
			response.setDescription("LoginFirst");

		}
		return response;
		// End of getAlTask()
	}

	@GetMapping(path = "/getTaskByPriority", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Response getTaskByPriority(@RequestParam("name") String name, HttpServletRequest req) {

		Response response = new Response();
		if (req.getSession(false) != null) {
			if (taskRepository.countTask(name) >= 0) {
				response.setStatusCode(201);
				response.setMessage("Success");
				response.setDescription("Task data found successfully");
				response.setTaskBean(taskRepository.getTaskByPriority(name));

			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Task data not found");
			}
		} else {
			response.setStatusCode(501);
			response.setMessage("Login Failure");
			response.setDescription("LoginFirst");

		}
		return response;
	}// End of getTask()

	@PostMapping(value = "/updateTaskStatus", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response updateStatus(@RequestParam("taskId") int taskId, @RequestParam("status") String status,
			HttpServletRequest req) {
		CreateTaskBean taskbean = taskRepository.findById(taskId).get();
		Response response = new Response();
		if (req.getSession(false) != null) {
			if (taskbean != null) {
				taskbean.setStatus(status);
				taskRepository.save(taskbean);
				response.setStatusCode(201);
				response.setMessage("Success");
				response.setDescription("Status Change successfully");

			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Status not Changed");
			}
		} else {
			response.setStatusCode(501);
			response.setMessage("Login Failure");
			response.setDescription("LoginFirst");
		}

		return response;
	}

}
