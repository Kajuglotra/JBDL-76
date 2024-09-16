package com.gfg.interfaces;

public class DemoClass implements InterfaceDemo, InterfaceDemo2{

    @Override
    public int getA() {
        return 0;
    }

    static String getB(){
        return "coming from InterfaceDemo";
    }

    @Override
    public String getDefault() {
        return InterfaceDemo2.super.getDefault();
    }
}
