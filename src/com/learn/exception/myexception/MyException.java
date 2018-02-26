package com.learn.exception.myexception;

public class MyException extends Exception{
    public MyException(){
        super();
    }

    public MyException(String errorMessage){
        super(errorMessage);
    }
}
