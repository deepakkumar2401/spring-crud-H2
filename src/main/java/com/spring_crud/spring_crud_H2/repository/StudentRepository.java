package com.spring_crud.spring_crud_H2.repository;

import com.spring_crud.spring_crud_H2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
