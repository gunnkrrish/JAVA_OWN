package java_core.Exception_handling;

public class file_02 {
    public static void main(String[] args) {
        String str = null;
        //System.out.println(str);        //print null
       // System.out.println(str.toUpperCase());  //gives error nullptr exception
       //so write in try catch
       try{
        System.out.println(str.toUpperCase());
       }
       catch(NullPointerException n){
        System.out.println("null cant be casted");
       }
    }
    
    
}
