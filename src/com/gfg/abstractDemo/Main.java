package com.gfg.abstractDemo;

public class Main {

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        System.out.println(demo2.getA());

        Demo demo = new Demo(){
            @Override
            public void printB() {
                System.out.println("print b");
            }
        }; // anonymous class which got created internally
        OuterClass.InnerClass o = new OuterClass.InnerClass();

    }
}
