// package java_core;

// public class Constructor_overload {
//     int a; double b; String c;
//     Constructor_overload(){
//         a=100;
//         b = 45.32;
//         c = "ankit";
//     }
//     Constructor_overload(int x){
//         a = x;
//     }
//     // Constructor_overload(int x,float y){

//     // }
//     Constructor_overload(double y,String z){
//         b =y;c =z;  
//     }
    
// }
// class B{
//     public static void main(String[] args) {
//         Constructor_overload r = new Constructor_overload();
//     Constructor_overload r2 = new Constructor_overload(10);
//     Constructor_overload r3= new Constructor_overload (23.89,"gunn");
//     System.out.println(r.a+" "+r.b+" "+r.c);
//     System.out.println(r2.a);
//     System.out.println(r3.b+" "+r3.c);
//     }
    
// }





package java_core;

public class Constructor_overload {
    int a; double b; String c;
    private Constructor_overload(){
        a=10940;
        b = 445.32;
        c = "abenkit";
    }
    //we can use private or default
    Constructor_overload(int x){
        a = x;
    }
    // Constructor_overload(int x,float y){

    // }
    Constructor_overload(double y,String z){
        b =y;c =z;  
    }
    public static void main(String[] args) {
        Constructor_overload r = new Constructor_overload();
    Constructor_overload r2 = new Constructor_overload(10);
    Constructor_overload r3= new Constructor_overload (23.89,"gunn");
    System.out.println(r.a+" "+r.b+" "+r.c);
    System.out.println(r2.a);
    System.out.println(r3.b+" "+r3.c);
    }
}

