package java_core.Exception_handling;

public class file_04 {
    //try catch finally block

    public static void main(String[] args) {
        try{
            System.out.println("learn coding");
            int a = 20,b=0,c;
            c=a/b;
            System.out.println(c);
            System.out.println("try");
        }
        catch(NullPointerException e){
            System.out.println("cannot divide by 0");
        }
        finally
        {
            System.out.println("finnaly");
        }
        System.out.println("main");
    }
}
