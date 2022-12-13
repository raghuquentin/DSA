package com.dsa.exception;

public class InputArrNumberFormatException extends RuntimeException{
    public InputArrNumberFormatException(){
        super();
    }
    public InputArrNumberFormatException(String msg){
        super(msg);
    }
    public InputArrNumberFormatException(String msg, Throwable e){
        super(msg,e);
    }
}
