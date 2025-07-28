package ACP;

// ques : given an array, find the most frequent element in it , if there are multiple elements that appear max number of times , print any of them
import java.util.*;
public class Hashmap2 {
    public static void HashMapMethod(int arr[]){
        Map<Integer,Integer> mp = new HashMap<>();

        for(int k : arr){
            if(!mp.containsKey(k)){
                mp.put(k,1);
            }
            else{
                mp.put(k,mp.get(k)+1);
            }
        }

        int max = 0;
        int k=0;
        for(var e: mp.entrySet()){
            if(max< e.getValue()){
                max = e.getValue();
                k= e.getKey();
            }
        }
        System.out.println(k);


    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,2,2,2,2,2,2,1,4,1};
        HashMapMethod(arr);

    }
}
