//DEFAULT CONSTRUCTOR

// package java_core;
// class A{
//     int a; 
//     String name;
//     A(){
//         a =10; //if we remove constructor then it will give 0 and null
//         name = "rahul";
//     }
//     void show(){
//         System.out.println(a+" "+name);
//     }
// }
// class Constructors {
//     public static void main(String[] args) {
//         A ref = new A();
//         ref.show();
        
//     }
// }


//PARAMETRIZED CONSTRUCTOR

// package java_core;
// class A{
//     int x,y; 
   
//     A(int a,int b){
//         x = a;
//         y=b;
//     }
//     void show(){
        
//         System.out.println(x+" "+y);
//     }
// }
// class Constructors {
//     public static void main(String[] args) {
//         A ref = new A(10,20);
//         ref.show();
        
//     }
// }


//COPY CONSTRUCTOR

// package java_core;
// class A{
//     int a;
//     String b; 
   
//     A(){
//        a = 10;
//        b = "coding";
//        System.out.println(a+" "+b);
//     } 
//     A(A ref){
//     a = ref.a;
//     b = ref.b;
//     System.out.println(a+" "+b);
//     }  
// }
// class Constructors {
//     public static void main(String[] args) {
//         A r = new A();
//         A r2 = new A(r);
//     }
// }


//PRIVATE CONSTRUCTOR

// package java_core;
// class Constructors {
//     int a;
//     double b; 
   
//     private Constructors(){
//        a = 10;
//        b = 20.56;
//        System.out.println(a+" "+b);
//     } 
//     public static void main(String[] args) {
//         Constructors r = new Constructors();
//     }
// }