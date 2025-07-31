package com.spring_crud.spring_crud_H2.controller;

import com.spring_crud.spring_crud_H2.dto.ApiResponse;
import com.spring_crud.spring_crud_H2.dto.StudentDto;
import com.spring_crud.spring_crud_H2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student-crud/H2-database/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/register")
    public ResponseEntity<ApiResponse> register(@RequestBody StudentDto studentDto) {
        return ResponseEntity.
                ok(new ApiResponse(false, "student register Successfully....", studentService.register(studentDto)));
    }

    @GetMapping("/getStudent/{id}")
    public ResponseEntity<ApiResponse> getStudent(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(new ApiResponse(false, "Student found successfully....", studentService.getStudent(id)));
    }
}
