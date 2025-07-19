package java_core;
class shape{
    void draw(){
        System.out.println("cant say shape type");
    } 
    //ye nhi hoga to error ayega
}
class square extends shape{
    @Override
    void draw(){
        System.out.println("in sqaure");
    }           // ye ni hoga to super class ka call hoga
}
public class Method_overriding {
    public static void main(String[] args) {
        shape r = new square();  //** u can do this way also
        r.draw();
    }
}
