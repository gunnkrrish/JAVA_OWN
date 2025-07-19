package ACP;

import java.util.function.Predicate;

//Predicate ----> one parameter returns boolean
// use only if you have conditionals checks in your program
public class lambda4 {
    public static void main(String[] args) {

        //ex 1
        // Predicate<Integer> p =(i)->(i>10);
        // System.out.println(p.test(20));
        // System.out.println(p.test(5));

        //ex 2  check the length of string greater than 4 or not
        // Predicate<String> o =(s)->(s.length()>4);
        // System.out.println(o.test("gunnieee"));

        //ex 3 diff values is paased in array
        String names[] = {"David","Scott","smith","john","hary"};
        Predicate<String> o =(s)->(s.length()>4);

        for(String name:names){
            if(o.test(name)){
                System.out.println(name);
            }

        }
    }
}
