package com.spring_crud.spring_crud_H2.exception;

import com.spring_crud.spring_crud_H2.dto.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity<ApiResponse> dataNotFound(Exception e) {
        return ResponseEntity.badRequest().body(new ApiResponse(true, e.getMessage(), null));
    }
}
