package com.novatec.test.api.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.Named;

import com.novatec.test.api.models.DTOs.StudentDTO;
import com.novatec.test.api.models.entities.Student;

/**
 * 
 * @author Albeiro Silva
 *
 */
public class MapperTranslator {

	@Named("convertListToList")
	public List<StudentDTO> mapperListToList(List<Student> students) {
		return students.stream().map(x -> {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setId(x.getId());
			studentDTO.setCourse(x.getCourse());
			studentDTO.setAge(x.getAge());
			studentDTO.setName(x.getName());
			studentDTO.setNumberPhone(x.getNumberPhone());
			return studentDTO;
		}).collect(Collectors.toList());
	}
}
