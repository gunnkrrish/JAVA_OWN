package ACP;
import java.util.*;
public class HashMap4 {
    //largest subarray with 0 sum
    public static void ans(int arr[]){
        HashMap<Integer,Integer> mp = new HashMap<>();
        int maxlength = 0;
        int sum =0;
        mp.put(0,-1);
        
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if(mp.containsKey(sum)){
                int length = i - mp.get(sum);
                if(maxlength < length){
                    maxlength = length;
                }
            }
            else{
                mp.put(sum,i);
            }
        }
        System.out.println(maxlength);

    } 
    public static void main(String[] args) {
        int arr[] = {15,-2,2,-8,1,7,10,-25};
        ans(arr);
    }
}
