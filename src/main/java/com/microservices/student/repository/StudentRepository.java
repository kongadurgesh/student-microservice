package com.microservices.student.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservices.student.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer> {

    List<Student> findAllBySchoolId(Integer schoolId);

}
