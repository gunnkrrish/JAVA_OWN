//check output***********************************************
package java_core;

import java.util.Scanner;
import java.util.Arrays;
public class Compare_arrays {
    public static void main(String[] args) {
         int a[] = new int[5];
        int a2[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("enter data in array : ");
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("enter data in 2nd array : ");
        for(int i=0;i<5;i++){
            a2[i] = sc.nextInt();
        }
        // if(a ==a2){
        //     System.out.print("equals");
        // }
        // else{
        //     System.out.print("not equal");
        // }


        // if(Arrays.equals(a,a2)){
        //     System.out.print("equals");
        // }
        // else{
        //     System.out.print("not equal");
        // }
    }
}
