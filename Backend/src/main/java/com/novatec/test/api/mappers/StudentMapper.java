package com.novatec.test.api.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.novatec.test.api.models.DTOs.StudentDTO;
import com.novatec.test.api.models.entities.Student;

/**
 * 
 * @author Albeiro Silva
 *
 */
@Mapper(uses = MapperTranslator.class)
public interface StudentMapper {

	StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);
	
	@Mapping(source = ".", target = ".")
	StudentDTO convertStudentEntityToStudentDTO(Student student);
	
	@Mapping(source = ".", target = ".")
	Student convertStudentDTOToStudentEntity(StudentDTO studentDTO);
	
	@Mapping(source = ".", target = ".", qualifiedByName = "convertListToList")
	List<StudentDTO> convertListEntityToListDTO(List<Student> students);
}
