package com.gfg.inheritance;

import java.util.ArrayList;
import java.util.List;

public class MainForPoly {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1,2,3)); // name, behavior changed, due to param

        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        System.out.println(advancedCalculator.add(1,2,3));

        // compile time, it was already decided which method to call
        // this is known as compile time polymorphism

        List<Integer> list = new ArrayList<>();

        Calculator calculator1 = (Calculator) new AdvancedCalculator(); // upcasting , done by compiler
        AdvancedCalculator advancedCalculator1 = (AdvancedCalculator) calculator1;
//        System.out.println(advancedCalculator1.multiply(a,b));

        // downcasting

        AdvancedCalculator a =new AdvancedCalculator();
//        a.subtract(4,2);
//        System.out.println(advancedCalculator1.subtract(4, 2)); // downcasted but calling parents
        // used ref var of parent
//         used object of child
        System.out.println(calculator1.add(1,2,3));

        // compiler is taking me to the parent class?
        // run time, it will call child method
        // run time

        // upcast -> your object has been the parent object

//        AdvancedCalculator advancedCalculator2  = new Calculator();


        AdvancedCalculator calculator2 = new AdvancedCalculator();
        calculator2.divide(4,2);
        calculator2.multiply(2,4);
        // u can not use the mthods present in parent

        Calculator calculator3 = new AdvancedCalculator();
        calculator3.divide(4,2);
        AdvancedCalculator advancedCalculator2 = (AdvancedCalculator) calculator3;
        advancedCalculator2.multiply(2,4);

    }
}
