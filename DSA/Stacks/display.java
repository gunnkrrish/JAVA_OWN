package DSA.Stacks;

import java.util.Stack;

public class display {
    //pass by ref
    public static void displayrevrec(Stack<Integer> st){
        if(st.size() ==0) return; 
        int top = st.pop();
         System.out.print(top +" ");
         displayrevrec(st);
         st.push(top);

    }
    public static void displayrec(Stack<Integer> st){
        if(st.size() ==0) return; 
        int top = st.pop();
        
         displayrec(st);
         System.out.print(top +" ");
         st.push(top);

    }
    public static void reverse(Stack<Integer> st){
        if(st.size() ==1) return;
        int top = st.pop();
        reverse(st);
        pushatbottom(st,top);
    }
    public static void pushatbottom(Stack<Integer> st,int x){
        if(st.size()==0){ st.push(x); return;}
        int top = st.pop();
        pushatbottom(st, x);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(15);
        //displayrevrec(st);

       reverse(st);
       //System.out.print(st);

         //System.out.println(st);

        // Stack<Integer> rt = new Stack<>();
        // while(st.size() >0){
        //     rt.push(st.pop());
        // }
        // while(rt.size()>0){
        //  int x = rt.pop();
        //  System.out.print(x+" ");   
        //  st.push(x);
        // }

        //using arrray
        // int n = st.size();
        // int[] arr = new int[n];
        // for(int i=n-1;i>=0;i--){
        //     int x = st.pop();
        //     arr[i] = x;
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        //     st.push(arr[i]);
        // }
    }
}
//1:45
