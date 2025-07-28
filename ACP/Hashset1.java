package ACP;
import java.util.*;
public class Hashset1 {
 public static void main(String[] args) {
    HashSet<String> st = new HashSet<>();
    st.add("james");
    st.add("scott");
    st.add("james");
    System.out.println(st);  //james,scott

    System.out.println(st.contains("james"));

    System.out.println(st.size());

    System.out.println(st.remove("james"));

    System.out.println(st.contains("james"));

    System.out.println(st.size());

    for(String s: st){
        System.out.println(s);
    }

 }   
}

/* OUTPUT
[james, scott]
true
2
true
false
1
scott */ 
