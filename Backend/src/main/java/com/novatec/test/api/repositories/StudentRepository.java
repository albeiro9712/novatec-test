package com.novatec.test.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.novatec.test.api.models.entities.Student;

/**
 * 
 * @author Albeiro Silva
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
