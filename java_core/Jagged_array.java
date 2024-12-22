package java_core;
import java.util.Scanner;
public class Jagged_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int [4][];
        System.out.println("Total rows: "+a.length);
        for(int i=0;i<a.length;i++){
            int cols = sc.nextInt();
            a[i] = new int [cols];
        }
        System.out.println("ënter the data : ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Jagged array : ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
