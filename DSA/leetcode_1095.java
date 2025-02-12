package DSA;

public class leetcode_1095 {
    public static void main(String[] args) {
        
    }
    
        static int findInMountainArray(int[] arr,int target) {
            int peak = peakIndexInMountainArray(arr);
            int first = ogbs(arr,target,0,peak);
            if(first != -1){
                return first;
            }
            return ogbs(arr,target,peak+1,arr.length -1);
        }
        static int peakIndexInMountainArray(int[] arr) {
            int start =0;
            int end = arr.length -1;
            while(start < end){
                int mid = start +(end-start)/2;
                if(arr[mid] > arr[mid+1]){
                    end = mid;
                }
                else{
                    start = mid +1;
                }
                
    
            }
            return start;
        }
           static int ogbs(int[] arr,int target,int start,int end){
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

