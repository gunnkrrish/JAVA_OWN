package DSA;
import java.util.Scanner;

public class GCD_functions_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        int largest =0;
       
        for(int i=1;i<=a;i++){
            if(a%i ==0 && b%i ==0){
                if(largest <i){
                    largest =i;
                } 
            }
        }
        System.out.println(largest);

    }
}
