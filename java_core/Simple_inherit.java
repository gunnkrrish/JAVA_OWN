package java_core;
class student{
    protected int roll,marks;
    String name;
    protected void input(){
        System.out.println("enter roll name and marks: ");
    }
}
public class Simple_inherit extends student {
    void disp(){
        roll =1;name = "ankit";marks = 89;
        System.out.println(roll+" "+name+" "+marks);
    }
    public static void main(String[] args) {
        Simple_inherit r = new Simple_inherit();
        r.input();
        r.disp();
    }
}


// Explanation

//     public → Accessible everywhere.
//     protected → Accessible within the same package + subclasses in other packages (only via inheritance).
//     default (no modifier) → Accessible only within the same package.
//     private → Not accessible outside the class.