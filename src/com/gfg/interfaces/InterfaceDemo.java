package com.gfg.interfaces;

public interface InterfaceDemo {

    int a =10; // public static and final

    public abstract int getA();

    // 1 default
    // 1 static

    static String getB(){
       return "coming from InterfaceDemo";
    }

     default String getDefault(){
        getC();
        return "coming from InterfaceDemo default method";
    }

    private String getC(){
        return  "dummy";
    }



}

// interface
// what to do

// class
// how to do

// Human -> eat , walk

// Kajal -> veg/non veg, run/skate