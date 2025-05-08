package DSA.Queue;
import java.util.*;
public class First_negative_in_window_k {
    public static  long[] print_First(long A[],int N,int k){
        long[] res = new long[N-k+1];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<N;i++){
            if(A[i]<0){
                q.add(i);
            }
        }
        for(int i=0;i<N-k+1;i++){
            if(q.size()>0 && q.peek()<i) q.remove();

            if(q.size()>0 && q.peek() <= i+k-1){
                res[i] = A[q.peek()];
            }
            else if(q.size() == 0) res[i] =0;
            else res[i] =0;
        }
        return res;
    }
    public static void main(String[] args) {
        long[] arr= {12,-1,-7,8,-15,30,16,28};
        long[] res1 = print_First(arr,arr.length,3);
        for(int i=0;i<res1.length;i++){
            System.out.print(res1[i]+" ");
        }
    }
}
