// package java_core;

// public class This {
//     void show(){
//         System.out.println(this);
//     }
//     public static void main(String[] args) {
//     This r = new This(); 
//     System.out.println(r);
//     r.show();
//     }
// }


// package java_core;

// public class This {
//     int a,b;
//     This(){
//          a = 10;
//           b = 20;
//     }
//     This(int a,int b){
//         //without this it will give 0
//         this.a = a; //this.a is instance var reffered 
//         this.b = b;
//     }
//     void display() {
//         System.out.println("a = " + a + ", b = " + b);
//     }
//     public static void main(String[] args) {
//     This r = new This(); 
//     This r2 = new This(40,50);
//     r.display();
//     r2.display();
//     }
// }



//call default constructor using parametrized constructor
// package java_core;

// public class This {
    
//     This(){
//         System.out.println("hello");
//     }
//     This(int a){
//         this();
//         System.out.println(a);
//     }
   
//     public static void main(String[] args) {
    
//     This r2 = new This(4);
    
//     }
// }


//call parametrized constructor using default constructor

package java_core;

public class This {
    
    This(){
        this(10);
        System.out.println("ohh");
        //this(10);//it must be declared above any statement
    }
    This(int a){
       
        System.out.println(a);
    }
   
    public static void main(String[] args) {
    
    This r2 = new This();
    
    }
}