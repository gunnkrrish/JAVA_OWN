package java_core.Exception_handling;

public class file_07 {
    //nested try block
    public static void main(String[] args) {
        try{
        try{
            int a[] = {10,20,30};
            System.out.println(a[5 ]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println(10/0);
    }
    catch(ArithmeticException c){
        System.out.println(c);
    }
    System.out.println("gunn");
    }
    
}
