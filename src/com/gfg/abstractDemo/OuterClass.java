package com.gfg.abstractDemo;

public class OuterClass {
    private int a  =10; // instance level variable
    public int c = 30; // instance
    public static int d = 40;

//    public OuterClass.InnerClass data;
//
//    public OuterClass(int a, OuterClass.InnerClass innerClass){
//        this.a =a;
//
//    }

    public static interface interfaceDemo{

    }

    // instance level class for outerclass
    public static class InnerClass{  // instance class present in outclass
        private int b = 20;

        public void printInnerData(){
            System.out.println(OuterClass.d);
            OuterClass outerClass = new OuterClass();
            System.out.println(outerClass.c);
            System.out.println(outerClass.a);
        }
    }

    public static void main(String[] args) {
        System.out.println("I am in main");
        OuterClass outerClass = new OuterClass();
        OuterClass outerClass2 = new OuterClass();

        System.out.println(outerClass.a);
        InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.printInnerData();

    }
}

// u only create inner class, u know that your inner class
// does not have independent requirement

// private things from outer class does not come to inner class
// interface--> interface
// class --> class
// class -> interface ?

// interface ---> class?

// enums  --> special kind of class // local databases