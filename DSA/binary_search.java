package DSA;

public class binary_search {
    public static void main(String[] args) {
        int[] arr = {2,3,4,16,18,22,45};
        int target = 16;
        int ans = bin(arr,target);
        System.out.println(ans);
    }
    static int bin(int[] arr,int target){
        int start =0;
        int end = arr.length-1;
        while(start <= end){
           // int mid = (start+end)/2;    might be possible that start+ end range may exceed in java
           int mid = start + (end-start)/2;   //it will not exceed, but it is a same way only as above but better way
            if(target <arr[mid]){
                end = mid -1;
            }
            else if(target >arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
}
