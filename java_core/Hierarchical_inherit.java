package java_core;

class a{
    void input(){
        System.out.println("enter ur name");
    }
}
class b extends a{
    void show(){
        System.out.println("my name is akit");
    }
}
class c extends a{
    void disp(){
        System.out.println("my name is ankush");
    }
}
public class Hierarchical_inherit{
    public static void main(String[] args) {
        b r = new b();
        c t = new c();
        r.input(); r.show();
        t.input(); t.disp();
    }
}
