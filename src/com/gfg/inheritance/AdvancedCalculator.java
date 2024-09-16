package com.gfg.inheritance;

import org.gfg.Demo;

public class AdvancedCalculator extends Calculator {

//     private int a =20;
    int b = 40;

    public int add(int a, int b){
        return a+b;
    }
    public int multiply(int a, int b){
        return  a*b;
    }

    public int add(int a, int b, int c){
        return a+b+c+1;
    }

    public void changeA(){
        this.a=20;
    }

//    private getA()


    public int getParentA(){
        return super.a;
    }

}
