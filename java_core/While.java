package java_core;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int n;
        System.out.print("enter value for condition: ");
        Scanner ref = new Scanner(System.in);
        n= ref.nextInt();
        while(n<=10){
            System.out.println("GUNN");
            n++;
        }
    }
}
