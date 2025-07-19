package java_core.Exception_handling;

public class file_05 {
    public static void main(String[] args) {
         //multiple try-catch block
    try{
        int a = 10,b=0,c;
        c=a/b;
        System.out.println(c);
    }
    catch(ArithmeticException a){
        System.out.println("first try block");
    }
    try{
        int a[] = {10,20,30,40};
        System.out.println(a[5]);
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("try block 2");
    }
    }
   
}
