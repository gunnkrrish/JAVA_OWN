package DSA;
public class leetcode_58{
    public static void main(String[] args) {
        String str = "fly me   to   the moon ";

   
        
            int length=0;
            for(int i=str.length()-1;i>=0;--i){
                if(str.charAt(i)==' '&& length>0) break;
                if(str.charAt(i)!=' ') ++length;
            }
          System.out.println(length);


    }
}