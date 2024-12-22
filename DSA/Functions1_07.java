package DSA;
import java.util.Scanner;

public class Functions1_07 {
    public static int add(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        int sum = add(a,b);
        System.out.println(sum);
    }
}
