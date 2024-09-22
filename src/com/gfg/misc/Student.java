package com.gfg.misc;

public class Student {

    private String  name;

    private Integer id;

    public Student(String  name, Integer id){
        this.name = name;
        this.id = id;
    }
    @Override
    public int hashCode(){
        return this.id.hashCode()+this.name.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if(obj.getClass() != this.getClass())
            return false; // u are comparing same class objects here

        Student student = (Student) obj;
        if(this.id.equals(student.id) && this.name.equals(student.name))
            return  true;

        return  false;

    }

    public static void main(String[] args) {
        Student s1 = new Student("kajal", 1);
        Student s2 = new Student("kajal", 1);

        System.out.println(s1.equals(s2));
        System.out.println(s1); // s1 is not the hashcode
        System.out.println(s2);
//        System.out.println(s1.equals(s1));
    }
}
// == checks the ref

// equals method is returning u true
// hashcodes for 2 objects are different ?

// java says equals and hashcode method
// equals should return true only when hashcodes of objects are same