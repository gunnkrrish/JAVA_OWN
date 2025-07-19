package java_core.Exception_handling;
class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        System.out.println(msg);
    }
}
public class file_14 {
    // throw vs throws vs try-catch

    public static void vote(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("not eligible");
        }
        else{
            System.out.println("eligible");
        }
    }
    public static void main(String[] args) {
        try{
            vote(12);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}
