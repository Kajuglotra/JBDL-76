package com.gfg.abstractDemo;

public enum DaysEnum {

    // mini db for local project
    SUNDAY(7, "sun"),
    MONDAY(1, "mon"),
    TUESDAY(2, "tue");

    public int id;
    public String val;

    DaysEnum(int id, String val){
        this.id=id;
        this.val=val;
    }

    public static void main(String[] args) {
        for(DaysEnum daysEnum : DaysEnum.values()){ // values method is not present in the enum , added by the compiler
            System.out.println(daysEnum);
        }
        System.out.println(DaysEnum.valueOf("SUNDAY").val);
        System.out.println(DaysEnum.SUNDAY.val);
        // ordinal
    }
}

// enum special class
// class DaysEnum extends Enum
//public enum DaysEnum == public class DaysEnum extends Enum
// name
// SUNDAY
// MONDAY
// TUESDAY