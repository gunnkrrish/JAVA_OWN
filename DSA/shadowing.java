package DSA;
//check output
public class shadowing {
    static int x=90;
    public static void main(String[] args) {
        System.out.println(x);
    //     int x;
        // System.out.println(x);  //this will give error becaz x not initialized
        x=40;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
