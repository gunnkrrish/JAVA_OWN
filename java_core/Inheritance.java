package java_core;
class Base{
    int x;
    public int getX(){
        return x;
    } 
    public void setx(int x){
        System.out.println("i am in base and  setting x now");
        this.x = x;
    }
    public void printme(){
        System.out.println("i am a constructor");
    }
}

class Derived extends Base{
    int y;
    public int getY(){
        return y;
    } 
    public void setY(int y){
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        
        //creating an objectof base class
        
        Base b = new Base();
        b.setx(4);
        System.out.println(b.getX());

        //creating an object of dervied class
        Derived d = new Derived();
        d.setx(43 );
        System.out.println(d.getX());
    }
}
