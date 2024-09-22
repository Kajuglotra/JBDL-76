package com.gfg.exception;

public class AgeChecker extends Exception{ // checked

    public AgeChecker(String msg){
        super(msg);
    }
}
//RuntimeException -> unchecked exception
// Exception --> checked