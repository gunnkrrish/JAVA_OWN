package java_core;

public class String_builder_Q1 {
    public static void main(String[] args) {
        
        //reverse a string
        StringBuilder sb = new StringBuilder("hello");
        for(int i=0; i<sb.length()/2;i++){
            int front =i;
            int back = sb.length() - 1 - i;

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }
}
