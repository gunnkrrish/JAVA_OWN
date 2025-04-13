package DSA.Stacks;

import java.util.Scanner;
import java.util.Stack;
public class Move_stacks_same_order { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        
        int n;
        System.out.println("enter no of elemnts u want to insert");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);

        //reverse order
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            // int x = st.peek();
            // rt.push(x);
            // st.pop();

            rt.push(st.pop());
        }
        //System.out.println(rt);

        //copy contents in same order  //o(2n) completxity

        Stack<Integer> gt = new Stack<>();
        while(rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println(gt);

    }
}
