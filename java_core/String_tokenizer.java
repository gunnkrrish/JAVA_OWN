
package java_core;
import java.util.StringTokenizer;

public class String_tokenizer {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("my name is gunn"," ");
        System.out.println(st.countTokens());

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
