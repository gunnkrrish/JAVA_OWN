package DSA;

public class Recursion_08 {

    static int factorial (int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n* factorial(n-1);
        }
        
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println("the value is : "+ factorial(n));
    }
    
}
