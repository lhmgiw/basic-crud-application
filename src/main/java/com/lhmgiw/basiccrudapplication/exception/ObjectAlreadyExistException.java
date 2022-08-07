package com.lhmgiw.basiccrudapplication.exception;

public class ObjectAlreadyExistException extends RuntimeException{
    public ObjectAlreadyExistException(String message){
        super(message);
    }
}
