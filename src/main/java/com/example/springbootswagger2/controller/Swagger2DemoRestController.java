package com.example.springbootswagger2.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.springbootswagger2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootswagger2.model.Student;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Swagger2DemoRestController", description = "REST Apis related to Student Entity!!!!")
@RestController
public class Swagger2DemoRestController {

	@Autowired
	private StudentService studentService;

	@ApiOperation(value = "Get list of Students in the System ", response = Iterable.class, tags = "getStudents")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), 
			@ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	@GetMapping(value = "/getStudents")
	public List<Student> getStudents() {
		return studentService.getStudents();
	}

	@GetMapping(value = "/getStudentById/{}")
	public Student getStudentById(String id){
		return studentService.getStudent(id);
	}

	@ApiOperation(value = "Get specific Student in the System ", response = Student.class, tags = "getStudent")
	@RequestMapping(value = "/getStudent/{name}")
	public Student getStudent(@PathVariable(value = "name") String name) {
		return studentService.getStudentByName(name);
	}



}
