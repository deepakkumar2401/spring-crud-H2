package com.spring_crud.spring_crud_H2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiResponse {

    private boolean error;
    private String message;
    private Object data;
}
