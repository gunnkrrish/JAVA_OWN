//SUM OF FIRST n NATUAL NUMBERS
import java.util.Scanner;

public class Loops_04 {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum= sum+i;
        }
        System.out.println(sum);
    }
}
