package com.novatec.test.api.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.novatec.test.api.mappers.StudentMapper;
import com.novatec.test.api.models.Response;
import com.novatec.test.api.models.DTOs.StudentDTO;
import com.novatec.test.api.models.entities.Student;
import com.novatec.test.api.repositories.StudentRepository;

/**
 * 
 * @author Albeiro Silva
 *
 */
@Service
public class StudentServiceImpl implements IStudentService {

	private static final Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);
	private StudentRepository studentRepository;

	@Autowired
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public Response<StudentDTO> saveStudent(StudentDTO studentDTO) {
		LOGGER.info(" * * Method: Invoking saveStudent. ..");
		
		Student studentConvert = StudentMapper.INSTANCE.convertStudentDTOToStudentEntity(studentDTO);
		Student studentSaved = studentRepository.save(studentConvert);
		Response<StudentDTO> response = new Response<StudentDTO>();
		response.setStatus(HttpStatus.CREATED);
		response.setDeveloperMessage("student saved successfully");
		StudentDTO studentDTOReturn = StudentMapper.INSTANCE.convertStudentEntityToStudentDTO(studentSaved);
		response.setData(studentDTOReturn);
		
		LOGGER.info(" * * Method: Invoked saveStudent complete. ..");
		return response;
	}

	@Override
	public Response<List<StudentDTO>> getAllStudents() {
		LOGGER.info(" * * Method: Invoking getAllStudents. ..");
		
		Response<List<StudentDTO>> response = new Response<List<StudentDTO>>();
		List<Student> students = studentRepository.findAll();
		
		response.setStatus(HttpStatus.OK);
		response.setDeveloperMessage("get all students success");
		List<StudentDTO> studentsDTO = StudentMapper.INSTANCE.convertListEntityToListDTO(students);
		response.setData(studentsDTO);
		
		LOGGER.info(" * * Method: Invoked getAllStudents complete. ..");
		return response;
	}

}
