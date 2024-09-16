package com.gfg.interfaces;

public class Main {
    public static void main(String[] args) {
        DemoClass demoClass = new DemoClass();
        System.out.println(demoClass.getDefault());

        InterfaceDemo demo = new DemoClass();
        demo.getDefault();
        InterfaceDemo.getB();
    }
}
// class extends class
// interface extends interface
// class implements interface
// interface implements class