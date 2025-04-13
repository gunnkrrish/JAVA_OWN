package DSA.Stacks;
import java.util.*;
public class nextGreaterElement {
    public static void main(String[] args) {
        int[] arr ={1,5,3,2,1,6,3,4};
        int n = arr.length;
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        res[arr.length-1] = -1;
        st.push(arr[arr.length-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size() > 0 && st.peek() < arr[i] ){
                st.pop();
            }
            if(st.size() ==0){
                res[i] = -1;
            }
            else{
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
