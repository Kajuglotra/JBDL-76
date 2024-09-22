package com.gfg.exception;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Date> list = new ArrayList<>();
        while(true){
            System.out.println("date inside the while");
            list.add(new Date());
        }
//        add(2,3);
    }

    private static int add(int a, int b) {
       return a*b; // logical error
    }
}
// heap out of space:Java heap space

// stack overflow?: StackOverflowError
