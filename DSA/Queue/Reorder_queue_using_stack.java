package DSA.Queue;

import java.util.LinkedList;
import java.util.*;

public class Reorder_queue_using_stack {
    public static void main(String[] args) {
         Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q);  //1 2 3 4 5 6 7 8
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<(n/2);i++){
            st.push(q.remove());
            // 5 6 7 8
        }
        while(st.size()>0){
            q.add(st.pop());
            // 5 6 7 8 4 3 2 1
        }
        for(int i=0;i<(n/2);i++){
            st.push(q.remove());
            // 4 3 2 1 
        }
        while(st.size()>0){
           //first stack then queue
           q.add(st.pop());
           q.add(q.remove());
        }
        // 8 4 7 3 6 2 5 1
        //reverse the queue
        while(q.size()>0){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
