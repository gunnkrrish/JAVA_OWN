package ACP;

import java.util.function.Predicate;
import java.util.ArrayList;

class Employee{
    String ename;
    int salary;
    int experience;
    Employee(String name,int sal,int exp){
        ename = name;
        salary = sal;
        experience = exp;
    }
}
public class lambda5 {
    public static void main(String[] args) {

        //lambda exp should take emp obj ---> return name if salary is > 50k exp >3
        // here we passed only 1 obj eg-1
        Employee obj = new Employee("gunn", 50000, 5);

        Predicate<Employee> pr = e->(e.salary >30000 && e.experience>3);
        System.out.println(pr.test(obj)); 

        //ex2: apply to each obj
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee("gunn", 50000, 5));
        al.add(new Employee("ok", 5000, 2));
        al.add(new Employee("kinn", 30000, 5));
        al.add(new Employee("oggg", 70000, 4));

        for(Employee e: al){
            if(pr.test(e)){
              System.out.println(e.ename+" "+e.salary);  
            }
        }




    }
}
