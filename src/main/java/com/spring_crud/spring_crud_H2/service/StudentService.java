package com.spring_crud.spring_crud_H2.service;

import com.spring_crud.spring_crud_H2.dto.StudentDto;

public interface StudentService {

    public StudentDto register(StudentDto studentDto);

    public StudentDto getStudent(Long id);
}
