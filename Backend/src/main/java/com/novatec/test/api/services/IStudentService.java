package com.novatec.test.api.services;

import java.util.List;

import com.novatec.test.api.models.Response;
import com.novatec.test.api.models.DTOs.StudentDTO;

/**
 * 
 * @author Albeiro Silva
 *
 */
public interface IStudentService {

	public Response<StudentDTO> saveStudent(StudentDTO studentDTO);

	public Response<List<StudentDTO>> getAllStudents();
}
