package DSA;

public class celing_of_num_BS {
    public static void main(String[] args) {
        //ceiling of a given num : find the smallest element in array greater or equal to target element

                int[] arr = {2,3,4,16,18,22,45};
                int target = 15;
                int ans = bin(arr,target);
                System.out.println(ans);
            }
            static int bin(int[] arr,int target){
                //but if when target is gretaer than the gretaest number in array
                if(target > arr[arr.length -1]){
                    return -1;
                }
                
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
                return start;
                //return end; //for floor of a number
            
          

    }
}
