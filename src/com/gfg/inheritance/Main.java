package com.gfg.inheritance;

public class Main extends Object{
    public static void main(String[] args) {


        Calculator c = new Calculator();
        AdvancedCalculator c1 = new AdvancedCalculator();
        System.out.println(c1.a);

        c1.changeA();
        System.out.println(c1.a);

//        System.out.println(c.a);

        System.out.println("-------------");

//
//
//        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
//        System.out.println(advancedCalculator.hashCode());
//        System.out.println(advancedCalculator.divide(4,2));
//
//        Calculator calculator = new Calculator();
//        System.out.println(calculator.hashCode());
//        System.out.println(advancedCalculator.a);
//
//
//        Mathscalculator mathscalculator = new Mathscalculator();
//        mathscalculator.a = 200;
////        mathscalculator
//        System.out.println(mathscalculator.getParentA());
//
//        Student student = new Student();
//        Address address = new Address("125001", "hisar");
////        address.setCity("hisar");
////        address.setPincode("125001");
//
//        student.setAddress(address);
//        student.setName("kajal");
//

    }
}
