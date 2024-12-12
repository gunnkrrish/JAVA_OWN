package java_core;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};             //any elements can be inserted
        System.out.println(a[2]);

        int b[] = new int [5];          // can only put element upto 5
        b[0] = 10;
        b[1] = 20;
        b[3] = 30;
        for(int i=0;i<5;i++){
            System.out.print(b[i] +" " );
        }


        //dynamically runtime m size define hoga
        int size,i;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int [size];
        for(i=0 ; i<size;i++){
            arr[i] = sc.nextInt();
        }
        // for(i=0 ; i<size;i++){
        //     System.out.print(arr[i]+ " " );
        // }


        for(int d: arr){
            System.out.print(d+" ");
        }

    }
}
