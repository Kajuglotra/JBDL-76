package com.gfg.exception;

public class Client {

    public static void main(String[] args) throws Exception {
        try{
            String s = "abc";
            System.out.println(s.length());
            method();
//            int a = 2/0;
        }catch (NullPointerException e){
            System.out.println("you are passing null string");
            method();
        }catch (ArithmeticException ex){
            System.out.println(ex);
        }catch (Exception e){
            System.out.println("some generic exception came ");
        }
    }

    private static void method() throws Exception {
        try{
            method1();
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception(e);
        }

    }

    private static void method1() throws Exception {
        try{
            int a = 2/0;
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception(e);
        }


    }
}

//this is incorrect way of handling an exception
// you will never able to understand, how many time the exception actually happened
