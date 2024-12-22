package DSA;
import java.util.Scanner;

public class Functions2_07 {
    public static int fact (int n){
        int fac=1;
        if(n==0){
            return 1;
        }
        else{
        for(int i=n;i>=1;i--){
            fac = fac*i;
        }
        return fac;
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fac = fact(num);
        System.out.println(fac);
    }
}

//******************************************imp diff********************************* */
//methods are called through class/objects and functions is called directly