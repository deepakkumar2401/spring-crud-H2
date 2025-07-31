package com.spring_crud.spring_crud_H2.service;

import com.spring_crud.spring_crud_H2.dto.StudentDto;
import com.spring_crud.spring_crud_H2.entity.Student;
import com.spring_crud.spring_crud_H2.exception.DataNotFoundException;
import com.spring_crud.spring_crud_H2.repository.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentDto register(StudentDto studentDto) {
        Student student = new Student();
        BeanUtils.copyProperties(studentDto, student);
        Student dbStudent = studentRepository.save(student);
        BeanUtils.copyProperties(dbStudent, studentDto);
        return studentDto;
    }

    @Override
    public StudentDto getStudent(Long id) {
        Optional<Student> byId = studentRepository.findById(id);
        if (byId.isPresent()) {
            StudentDto studentDto = new StudentDto();
            Student student = byId.get();
            BeanUtils.copyProperties(student, studentDto);
            return studentDto;
        }
        throw new DataNotFoundException("Student not present with this id:");
    }
}
