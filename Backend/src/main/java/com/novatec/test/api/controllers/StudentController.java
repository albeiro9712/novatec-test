package com.novatec.test.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.novatec.test.api.models.Response;
import com.novatec.test.api.models.DTOs.StudentDTO;
import com.novatec.test.api.services.IStudentService;

/**
 * 
 * @author Albeiro Silva
 *
 */
@RestController
@RequestMapping("/api/v1/students")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StudentController {

	private final IStudentService iStudentService;

	@Autowired
	public StudentController(IStudentService iStudentService) {
		this.iStudentService = iStudentService;
	}
	
	@PostMapping()
	public ResponseEntity<Response<StudentDTO>> saveStudent(@RequestBody StudentDTO studentDTO){
		Response<StudentDTO> response = iStudentService.saveStudent(studentDTO);
		return new ResponseEntity<Response<StudentDTO>>(response, response.getStatus());
	}
	
	@GetMapping()
	public ResponseEntity<Response<List<StudentDTO>>> getAllStudents(){
		Response<List<StudentDTO>> response = iStudentService.getAllStudents();
		return new ResponseEntity<Response<List<StudentDTO>>>(response, response.getStatus());
	}
	
}
