package java_core;

public class String_buffer {
  public static void main(String[] args) {
    
    StringBuffer str = new StringBuffer("gunn");
    str.append(" khurana");
    System.out.println(str);
    str.setCharAt(1, 'a');
    System.out.println(str);
    str.insert(3,"abxcd");
    System.out.println(str);
    str.setLength(2);
    System.out.println(str);
  }  
}



//package Java;
//import java.util.*;
// public class string_java {
//     public static void main(String[] args) {
//     String str = "ankit"; 
//     System.out.println(str);
//     String str1="ankit";
//     System.out.println(str1);

//     //if want to change the value forcefully
//     str=str.concat("kumar");
//     System.out.println(str);
//     System.out.println(str.length());

//     //print all the characters of string
//     for(int i=0;i<str.length();i++){
//         System.out.println(str.charAt(i));
//         }
    
//     //compares string  "==" fails in some cases 
//     if(str.compareTo(str1)==0){
//         System.out.println("equal");
//     }
//     else{
//         System.out.println("not equal");
//     }

//     //substring method-begin index is inclusive and end index is exclusive
//     System.out.println(str.substring(2, 5));
// }  
// }

//new keyword
// public class string_java {
//     public static void main(String[] args) {
//     String str = new String("ankit");
//     System.out.println(str);
//     String str1=new String("ankit");
//     System.out.println(str1);

//     //if want to change the value forcefully
//     str=str.concat(" kumar");
//     System.out.println(str);
// }
// }

//stringbuffer
// public class string_java {
//     public static void main(String[] args) {
//     StringBuffer str = new StringBuffer();
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the string");  
//     str.append(sc.nextLine());    //sc.nextline se error aata isliye append krake nextline lete hai
//     str.setCharAt(3, 'u');
//     System.out.println(str);
//     str.insert(3, "hi");
//     System.out.println(str);
//     str.setLength(20);
//     System.out.println(str);
// }
// }


//stringbuilder
// public class string_java {
//     public static void main(String[] args) {
//     StringBuilder sb = new StringBuilder("tony"); 
//     System.out.println(sb);

//     //char at index 0
//     System.out.println(sb.charAt(0));

//     //set char at index 
//     sb.setCharAt(0, 'p');
//     System.out.println(sb);

//     //insert at index
//     sb.insert(0, "s");
//     System.out.println(sb);

//     //delete at index
//     sb.delete(0,2);
//     System.out.println(sb);

//     //apend
//     sb.append("stark");
//     System.out.println(sb);

//     //length
//     System.out.println(sb.length());

//     //reverse
//     sb.reverse();
//     System.out.println(sb);
//     }
// }


//reverse a string using stringbuilder functions but not reverse function
// public class string_java {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("hello");
//         for(int i=0;i<sb.length()/2;i++){
//             int front=i;
//             int back=sb.length()-1-i;
//             char frontchar=sb.charAt(front);
//             char backchar=sb.charAt(back);
//             sb.setCharAt(front,backchar);
//             sb.setCharAt(back,frontchar);
//         }
//         System.out.println(sb);
//     }
// }

//stringtokenizer
// public class string_java{
//     public static void main(String[] args) {
//         StringTokenizer st = new StringTokenizer("my name is abc"," ");
//         System.out.println(st.countTokens());
//         while(st.hasMoreTokens()){
//             System.out.println(st.nextToken());
//         }
//     }
// }