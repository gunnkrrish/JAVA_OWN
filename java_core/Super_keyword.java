// IN VAR

// package java_core;

// class o {
//     int a = 10;
// }
// class e extends o{
//     int a = 20;
//     void show(){
//         System.out.println(a);
//         System.out.println(super.a);
//     }
// }
// public class Super_keyword {
//     public static void main(String[] args) {
//         e r = new e();
//         r.show();
//     }
// }


//IN FUNCTION

// package java_core;

// class o {
//     void show(){
//         System.out.println("hello base");
//     }
// }
// class e extends o{
    
//     void show(){
//         super.show();
//         System.out.println("hello");
       
//     }
// }
// public class Super_keyword {
//     public static void main(String[] args) {
//         e r = new e();
//         r.show();
//     }
// }


//IN CONSTRUCTOR
// package java_core;

// class o {
//     o(){
//         System.out.println("hello base");
//     }
// }
// class e extends o{
    
//     e(){
        
//         System.out.println("hello");
       
//     }
// }
// public class Super_keyword {
//     public static void main(String[] args) {
//         e r = new e();
        
//     }
// }


//IN PARAMETERS

// package java_core;

// class o {
//     o(int a){
//         System.out.println("hello base" + a);
//     }
// }
// class e extends o{
    
//     e(){
//         super(112);  //without this it will give error that a is not defined in class o
//         System.out.println("hello");
       
//     }
// }
// public class Super_keyword {
//     public static void main(String[] args) {
//         e r = new e();
        
//     }
// }