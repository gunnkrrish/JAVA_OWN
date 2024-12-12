package java_core;
import java.util.Arrays;
public class Array_Methods {
    public static void main(String[] args) {
        String a[] ={"learn", "coding","keypoints","education"};

        System.out.println("toString method : "+ Arrays.toString(a));

        System.out.println("asList method: "+Arrays.asList(a));


        //deeptostring : works with multidimensional
        int arr[][]={{10,20},{30,40}};
        System.out.println("deeptostring method: "+Arrays.deepToString(arr));
    }
}
