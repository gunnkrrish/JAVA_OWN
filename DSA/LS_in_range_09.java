package DSA;

public class LS_in_range_09 {
    public static void main(String[] args) {
        int [] nums = {23,45,67,12,34,56};
        int target = 23;
        int ans = linear(nums, target,1,4);
        System.out.println(ans);
    }
    //search in range of 1-4
    static int linear(int[] arr,int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i=start;i<end;i++){  // no braces because it is a variable not method
            if(arr[i] ==target){
                return i;
            }
        }
        //if target not found
        //return -1;
        //if -1 in array then?
        return Integer.MAX_VALUE;
    }
}
