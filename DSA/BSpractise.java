package DSA;

public class BSpractise {
    public static void main(String[] args) {
        //search a number in infinite array
        int arr[] = {3,5,7,9,10,99,100,130,140,160,170};
        int target = 10;
        System.out.println(range(arr,target));
        

    }
    static int range(int[] arr,int target){
        //first find the range
        //start with the box of size 2
        int start =0;
        int end =1;

        //condition for target in the range
        while(target > arr[end]){
            int newS = end +1;
            //double
            //end = prev_end + size of box*2
            end = end + (end - start +1)*2;
            start = newS;
        }
        return bin(arr,target, start, end);
        
    }
    static int bin(int[] arr,int target,int start,int end){
        
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
