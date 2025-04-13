package DSA.Stacks;
import java.util.*;
public class remove_consequtive_subseq {
    public static int[] remove(int[] arr){
        Stack<Integer> st= new Stack<>();
        int t =-1;
        for(int i=0;i<arr.length;i++){
            if(st.size() ==0){
                st.push(arr[i]);

            }
            else if(arr[i] == st.peek()){
                t = st.pop();
                
            }
            else if(arr[i] == t){
                continue;
            }
            else {
                st.push(arr[i]);
            }
            
        }
        int[] res = new int[st.size()];
        for(int i= st.size()-1;i>=0;i--){
            res[i] = st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int[] res = remove(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
