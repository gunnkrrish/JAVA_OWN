package java_core;
class y{
    private int value; //data hiding

    public void setValue(int x){  //data abstarction
        value = x;
    }
    public int getValue(){
        return value;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        y r = new y();
        // r.value=100;  //this cant be accessed
        r.setValue(100);
        System.out.println(r.getValue());
    }
}
