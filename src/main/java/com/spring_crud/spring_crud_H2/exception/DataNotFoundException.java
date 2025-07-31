package com.spring_crud.spring_crud_H2.exception;

public class DataNotFoundException extends RuntimeException{

    public DataNotFoundException(String str){
        super(str);
    }
}
