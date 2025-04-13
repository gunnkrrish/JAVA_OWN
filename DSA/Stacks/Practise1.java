package DSA.Stacks;
import java.util.*;
public class Practise1 {
    //find the min number of brackets that we need to remove to make the given bracket seq balanced
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;
        Stack<Character> st = new Stack<>(); 
        for(int i=0;i<str.length();i++){
            char a = str.charAt(i);
            if(a== '('){
                st.push(a);
            }
            else{
                if(st.size() ==0){
                    count++;
                    continue;
                }
                if(a == ')' && st.peek() == '('){
                    st.pop();
                }

            }
        }
        int l = st.size();
        System.out.println(l+count); 
    }
}
