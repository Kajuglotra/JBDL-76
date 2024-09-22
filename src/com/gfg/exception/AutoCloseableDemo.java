package com.gfg.exception;

import java.io.*;

public class AutoCloseableDemo implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("I am in close meyhod");
    }

    public void printData(){
        System.out.println("printing lines");
    }

    public static void main(String[] args) throws Exception {
        AutoCloseableDemo demo1  = new AutoCloseableDemo();
        FileReader fileReader = new FileReader("");
        try(demo1;fileReader){
            System.out.println("in the try block");
            demo1.printData();
        }catch (IOException e){
            throw  new Exception(e);
//            e.printStackTrace();
        }
        // try with resource, u have to have a class implementing closeable

        AutoCloseableDemo demo  = new AutoCloseableDemo();
        try{
            demo.printData();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
//            demo.close();
            System.out.println("i am in the finally block");
        }
    }
}
// try with resource