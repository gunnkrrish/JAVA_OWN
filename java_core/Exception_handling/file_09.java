package java_core.Exception_handling;

public class file_09 {
    public static void main(String[] args) {
        //try-catch finally inside finally block

        try{
            String a="ankit";
            System.out.println(a.toUpperCase());
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
            System.out.println(10/0);

            }
            catch(ArithmeticException o){
                System.out.println(o);
            }
            finally{
                System.out.println("gunn");
            }
        }
        System.out.println("main method ended");
    }
}
