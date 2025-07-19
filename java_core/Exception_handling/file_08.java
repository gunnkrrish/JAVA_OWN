package java_core.Exception_handling;

public class file_08 {
    //try-catch inside catch block
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println(e);
            try{
                 String a = null;
            System.out.println(a.toLowerCase());
            }
            catch(NullPointerException n){
                System.out.println("null value cnt be converted");
            }
           
        }
        System.out.println("done");
    }
}
