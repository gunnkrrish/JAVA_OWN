package ACP;
import java.util.*;
public class Set1 {
    public static void main(String[] args) {
        Set<Integer> nums = new TreeSet<>();
        nums.add(2);
        nums.add(3);
        nums.add(4);

        //insetad of using for loop to print
        // for(int n:nums){
        //     System.out.println(n);
        // }


        //we can use iterators
        Iterator<Integer> values = nums.iterator();

        while(values.hasNext()){
            System.out.println(values.next());
        }


    }
}
