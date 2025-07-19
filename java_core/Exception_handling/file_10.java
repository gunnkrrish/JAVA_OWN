package java_core.Exception_handling;

public class file_10 {
    //throw
    public static void main(String[] args) {
        //System.out.println(10/0);  //jvm exception 

        throw new ArithmeticException("/ by zero");   //user defined exception
    }
}
