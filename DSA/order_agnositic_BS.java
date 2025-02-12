package DSA;

public class order_agnositic_BS {
    public static void main(String[] args) {
        int[] arr = {62,57,54,45,32,22,11};
        int target = 32;
        int ans =ogbs(arr, target);
        System.out.println(ans);
    }
    static int ogbs(int[] arr,int target){
        int start=0;
        int end = arr.length -1;
        //find wether in ascendng or desecending
        boolean isasc;
        if(arr[start] <arr[end]){
            isasc = true;
        }
        else{
            isasc = false;
        }


        while(start <= end){
            // int mid = (start+end)/2;    might be possible that start+ end range may exceed in java
            int mid = start + (end-start)/2;   //it will not exceed, but it is a same way only as above but better way

            if(arr[mid] == target){
                return mid;
            }
            if(isasc){
                if(target <arr[mid]){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
             if(target >arr[mid]){
                 end = mid -1;
             }
             else{
                 start = mid+1;
             }
         }
         
     }
     return -1;
    }
}
