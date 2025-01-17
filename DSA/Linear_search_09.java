package DSA;

public class Linear_search_09 {
    public static void main(String[] args) {
        int [] nums = {23,45,67,12,34,56};
        int target = 12;
        int ans = linear(nums, target);
        System.out.println(ans);
    }

    //search in the array if item found if not return -1 
    static int linear(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){  // no braces because it is a variable not method
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
