package java_core.Exception_handling;

public class file_06 {
    public static void main(String[] args) {
        try{
        int a=10,b=0,c;
        c=a/b;
        System.out.println(c);


        int arr[] ={10,20,30};
        System.out.println(arr[5]);

        String str ="asn";
        System.out.println(str.toUpperCase());
    }
    catch(ArrayIndexOutOfBoundsException a){
        System.out.println("not array");

    }
    catch(ArithmeticException e){
        System.out.println("maths");
    }
    catch (Exception e){
        System.out.println("overall");
    }

    }
    
}
