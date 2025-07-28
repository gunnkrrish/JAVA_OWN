package ACP;

import java.util.ArrayList;
import java.util.Collections;

public class EmpCompartor {
    public static void main(String[] args) {
        ArrayList<Emps> al = new ArrayList<>();
        al.add(new Emps("Monica", 90));
        al.add(new Emps("sameer", 60));

        Collections.sort(al,new AgeComapartor());

        for(Emps e:al){
            System.out.println(e.name +" "+e.age);
        }


    }
}
