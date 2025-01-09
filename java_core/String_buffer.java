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
