// package java_core;

// public class Var {
//     static int b =20;  //static
//     int c = 30;  //instance
//     public static void main(String[] args) {
//         int a = 10; //local
//         System.out.println(a);

//         System.out.println(Var.b);   //static

//         Var ref = new Var();        //instance
//         System.out.println(ref.c);

//     }
// }

// CHECK OUTPUT

package java_core;

public class Var {
    static int a =10;  //static
    void fun(){
        int b = 10;
        System.out.println(a+" "+b);
        ++a;
        ++b;
    }
    public static void main(String[] args) {
        Var r = new Var();
        r.fun();
        r.fun();

    }
}
