package com.dsa.exception;

public class NotReadableFromCmdLineException extends RuntimeException{
    public NotReadableFromCmdLineException(){
        super();
    }
    public NotReadableFromCmdLineException(String msg){
        super(msg);
    }
    public NotReadableFromCmdLineException(String msg, Throwable e){
        super(msg,e);
    }
}
