package java_core.Exception_handling;

public class file_15 {
    //exception propogation
    public static void main(String[] args) {
       try{
            m1();
        }
        catch(ArithmeticException a){
            System.out.println("handled");
        }
    }
    public static void m1(){
        // try{
        //     m2();
        // }
        // catch(ArithmeticException a){
        //     System.out.println("handled");
        // }
        m2();
        
    }
    public static void m2(){
        System.out.println(10/0);
    }
}
