package java_core;
class A{
    int a,b,c;
    void add(){
        a=10;b=20;
        c=a+b;
        System.out.println("sum of two no is : "+c);
    }
    void sub(){
        a=200; b=100;
        c = a-b;
        System.out.println("sub of two numbers: "+c);
    }
}
class B extends A{
    void mul(){
        a=200; b=100;
        c = a*b;
        System.out.println("mul of two numbers: "+c);
    }
    void div(){
        a=200; b=100;
        c = a/b;
        System.out.println("div of two numbers: "+c);
    }
}
class C extends B{
    void rem(){
        a=200; b=100;
        c = a%b;
        System.out.println("rem of two numbers: "+c);
    }
}
public class Multilevel_inherit {
    public static void main(String[] args) {
        C r = new C();
        r.add(); r.sub(); r.mul(); r.div(); r.rem();
    }
}
