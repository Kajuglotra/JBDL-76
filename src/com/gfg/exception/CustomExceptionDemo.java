package com.gfg.exception;

public class CustomExceptionDemo {
    public static void main(String[] args) throws AgeChecker {
        int age  =2;
        checkAge(age);
    }

    private static void checkAge(int age) throws AgeChecker {
        if(age <18){
            throw new AgeChecker("age is not valid");
        }
    }
}
