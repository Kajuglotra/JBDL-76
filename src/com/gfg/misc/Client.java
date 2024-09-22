package com.gfg.misc;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
       Logger i  = Logger.getInstance();
       i.printLog("printing log");
       System.out.println(i);
       i  = null;
       System.out.println(i);
       Logger i1  = Logger.getInstance();
        System.out.println(i1);
        int[] arr = new int[10];
        System.out.println(arr.length); // compiler -> confirm
        // Arrays class, u can use in order to perform operations on array
        Arrays.fill(arr, -1);
    }
}
