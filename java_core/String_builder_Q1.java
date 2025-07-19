package java_core;

import java.util.Scanner;

public class String_builder_Q1 {
    public static void main(String[] args) {
        
        //reverse a string
        // StringBuilder sb = new StringBuilder("hello");
        // for(int i=0; i<sb.length()/2;i++){
        //     int front =i;
        //     int back = sb.length() - 1 - i;

        //     char frontchar = sb.charAt(front);
        //     char backchar = sb.charAt(back);

        //     sb.setCharAt(front, backchar);
        //     sb.setCharAt(back, frontchar);
        // }
        // System.out.println(sb);



        //reverse astring
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);

        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length() -1-i;

            char f = sb.charAt(front);
            char b = sb.charAt(back);

            sb.setCharAt(front, b);
            sb.setCharAt(back, f);
        }
        System.out.println(sb);
    }
}
