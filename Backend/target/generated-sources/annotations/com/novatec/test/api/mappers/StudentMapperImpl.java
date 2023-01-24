package com.novatec.test.api.mappers;

import com.novatec.test.api.models.DTOs.StudentDTO;
import com.novatec.test.api.models.entities.Student;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-23T20:53:19-0500",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 1.4.300.v20221108-0856, environment: Java 17.0.5 (Eclipse Adoptium)"
)
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentDTO convertStudentEntityToStudentDTO(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setId( student.getId() );
        studentDTO.setName( student.getName() );
        studentDTO.setNumberPhone( student.getNumberPhone() );
        studentDTO.setAge( student.getAge() );
        studentDTO.setCourse( student.getCourse() );

        return studentDTO;
    }

    @Override
    public Student convertStudentDTOToStudentEntity(StudentDTO studentDTO) {
        if ( studentDTO == null ) {
            return null;
        }

        Student student = new Student();

        student.setId( studentDTO.getId() );
        student.setName( studentDTO.getName() );
        student.setNumberPhone( studentDTO.getNumberPhone() );
        student.setAge( studentDTO.getAge() );
        student.setCourse( studentDTO.getCourse() );

        return student;
    }

    @Override
    public List<StudentDTO> convertListEntityToListDTO(List<Student> students) {
        if ( students == null ) {
            return null;
        }

        List<StudentDTO> list = new ArrayList<StudentDTO>( students.size() );
        for ( Student student : students ) {
            list.add( convertStudentEntityToStudentDTO( student ) );
        }

        return list;
    }
}
