package ACP;

import java.util.Comparator;

class Emps{
    String name;
    int age;


    Emps(String name,int age){
        this.name = name;
        this.age = age;
    } 
}

public class AgeComapartor implements Comparator<Emps>{
    public int compare(Emps e1,Emps e2){
        if(e1.age == e2.age) return 0;
        else if(e1.age > e2.age) return 1;
        else return -1;
    }
}

