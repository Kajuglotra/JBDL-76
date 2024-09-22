package com.gfg.inheritance;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Calculator {

   public int a = 10; // can i make this a as private

    public static int getA(){
        return  10;
    }

    protected int getA(int a){
        return  10;
    }

    public int getA(int a, int b){
        return  10;
    }

    int divide(int a, int b){
        return a/b;
    }
    public int add(int a, int b){
        return a+b+1;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    private int subtract(int a, int b){
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        return a-b;
    }


}
// conclusion : default -> same package
// protected -> direct child
// private will not go anywhere
// public -> accessible from anywhere
