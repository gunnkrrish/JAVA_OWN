// package DSA.Queue;
// import java.util.*;
// public class reverse_queue {
//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         Stack<Integer> st = new Stack<>();
//         while(q.size()>0){
//             st.push(q.remove());
//         }
//         while(st.size()>0){
//             q.add(st.pop());
//         }
//         System.out.println(q);

//     }
// }




//reverse first 3 elements
package DSA.Queue;
import java.util.*;
public class reverse_queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(8);
        Stack<Integer> st = new Stack<>();
        while(q.size()>=3){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        int n = q.size();
        int i=0;
        while(i<(n-3)){
            int a = q.remove();
            q.add(a);
            i++;
        }
        System.out.println(q);

    }
}