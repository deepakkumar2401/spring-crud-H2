package com.spring_crud.spring_crud_H2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDto {

    private Long id;
    private String name;
    private String email;
    private Long mobile_no;
    private String gender;
}
