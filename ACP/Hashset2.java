package ACP;

import java.util.HashSet;

//longest consecutive
public class Hashset2 {
    public int longest(int[] nums){
        HashSet<Integer> st = new HashSet<>();
        for(int num: nums) st.add(num);
        int max =0;
        for(int num:st){
            if(!st.contains(num-1)){
                //num is starting point of sequence
                int curr = num; //1
                int currstreak = 1;//LENGTH OF CURRENT consecutive seq
                while(st.contains(curr+1)){
                    currstreak++;
                    curr++; 
                }

                max = Math.max(max,curr);
            }
        }
        return max;
    }
}
