package java_core;
import java.util.Scanner;
public class matrix_2d {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[][] = new int[2][2];
        System.out.println("enter arr elements");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        

    }
}
