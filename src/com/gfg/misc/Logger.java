package com.gfg.misc;

public class Logger {

    private static Logger instance = new Logger(); // early initialized
    // private constructor, you will not able to make object from outside of this class
    private Logger(){

    }
    // static method
    // threads
//    public static Logger getInstance(){
//        if(instance == null)
//            instance = new Logger();
//        return instance;
////    }


    public static Logger getInstance(){
        return  instance;
    }
    public void printLog(String logg){
        System.out.println(logg);
    }

}
// multiple threads running inside
// 2 threads creates 2 objects ?
// code which is written is not thread safe
// making this class thread safe is now your resp.

// early initialization is thread safe ?


