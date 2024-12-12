package java_core;

import java.util.Scanner;
import java.util.Arrays;
public class Array_static_methods {
    public static void main(String[] args) {
        int a[] = new int[5];
        //int a2[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("enter data in array : ");
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
        // System.out.print("enter data in 2nd array : ");
        // for(int i=0;i<5;i++){
        //     a2[i] = sc.nextInt();
        // }


        // Arrays.sort(a);
        // for(int i=0;i<5;i++){
        //    System.out.print(a[i]+" ");
        // }


        // System.out.println();
        // boolean b = Arrays.equals(a,a2);
        // System.out.println("eqaual h y ni h: "+b);

        int a2[]= Arrays.copyOf(a,5);
        for(int i=0;i<a2.length;i++){
            System.out.print(a2[i]+" ");
        }
    }
}
