import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int a = 100;
    public static void main(String[] args){

        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        Lecture jbdl76 =new Lecture();
//        jbdl76.setMentorName("kajal");
        int abc = Lecture.noOfS;
        // local variable
        Lecture.noOfS = 100;
        System.out.println(abc);
//        System.out.println(jbdl76.mentorName);
        Main main = new Main();
        int c = main.add(1, 2);
        System.out.println(c);
        String a = "abc";
        String b = "abc";
        b.toUpperCase();
        List<Integer> list  = new ArrayList<>();
        jbdl76.getDataWrapper();
        String ca = new String("abcd").intern().toUpperCase();
        ca ="abc";
//        == comparing the ref variable
        System.out.println(ca.equals(b));
        a = "abcd";
    }

    public int add(int a, int b){
        System.out.println(multiply(a, b));
        return a+b;
    }

    public static  int multiply(int a, int b){
//        Main main = new Main();
//        main.add(a, b);
        return a*b;
    }
}