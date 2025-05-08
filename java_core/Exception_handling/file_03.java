package java_core.Exception_handling;

public class file_03 {
    public static void main(String[] args) {
        String str = "gunn";
        try{
        int a=Integer.parseInt(str); //string to int  (iff str is number string)
        System.out.println(a);
    }
    catch(NumberFormatException n){
        System.out.println("string "+str+" cant be converted to int");
    }
    System.out.println("main method ended");
        }
        
       
}
