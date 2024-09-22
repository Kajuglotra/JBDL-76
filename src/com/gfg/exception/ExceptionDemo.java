package com.gfg.exception;

import java.io.FileReader;

public class ExceptionDemo {

    public int divide(int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        try {
            demo.divide(4, 2);
        }catch (Exception e){
            System.out.println(e);
            try{
                String a = null;
                System.out.println(a.length());
            }catch (Exception ex){
                System.out.println(ex);
            }

        }
        System.out.println("i am out of try and catch");

        // checked Exception
//        FileReader fileReader = new FileReader("");
    exceptionMethod();
        try {
            exceptionMethod();
        }catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e);
            System.exit(0);
        }finally {
            try{
                String  a= null;
                System.out.println(a.length());
            }catch (Exception e){

            }finally {

            }
            System.out.println("i am in finally block");
        }
        System.out.println("normal execution");

        exceptionMethod();

    }

    public static String exceptionMethod() throws RuntimeException{
        // throws keyword , is not dependent upon how interbal code is written
        throw new RuntimeException("exception thrown");
//        return "a";
    }


}
// try catch -> try

// try -> critical lines, in which exception can come