package java_core;

class base{
    public int x;
    base(){
        System.out.println("i am base class constructor");
    }
    base(int x){
        System.out.println("i am a constructor with int :" + x);
    }
    
   
    
}

class derived extends base{
    int y;
    derived(){
        super(0);
        System.out.println("i am dervied class constructor");
    }
    derived(int x,int y){
        super(x);
        System.out.println("i am a constructor with int :" + y);
    }
    
}
class child extends derived{
    child(){
        System.out.println("i am a child of derived");
    }
    child(int x,int y,int z){
        super(x,y);
        System.out.println("i am a child constructor with z : "+z);
    }
}
public class Constructors_inh {
    public static void main(String[] args) {
        System.out.println("Main method started");
        //base b = new base();
        //derived d = new derived(); 
        derived d = new derived(14,5); 
        //child c = new child(12,13,14);
        System.out.println("Main method ended");
    }
}

