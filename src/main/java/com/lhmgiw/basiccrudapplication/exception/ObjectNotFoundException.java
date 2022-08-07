package com.lhmgiw.basiccrudapplication.exception;

public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException(String message){
        super(message);
    }
}
