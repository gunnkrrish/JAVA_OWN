class Leetcode_33 {
    public int search(int[] nums, int target) {
        int pivot = findpivot(nums);

        if(pivot == -1){
            return bin(nums,target,0,nums.length-1);
        }  
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return bin(nums,target,0,pivot-1);
        }
        return bin(nums,target,pivot+1,nums.length-1);

    }
     int findpivot(int[] arr){
        int start =0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start +(end - start)/2;

            if(mid <end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid >start && arr[mid] <arr[mid -1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid -1;
            } else{
                start = mid +1;
            }
        }
        return -1;
    }
     int bin(int[] arr, int target,int start,int end){
        
        while(start<=end){
            int mid = start+(end - start)/2; 
            if(target < arr[mid]){
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


     //it doesnt work with duplicate elements so we will ignore start and end 
    int findpivotwithduplicate (int[] arr){
        int start =0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start +(end - start)/2;

            if(mid <end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid >start && arr[mid] <arr[mid -1]){
                return mid-1;
            }
            //if elemnts at middle , start , end just skip the dupliactes
            if(arr[mid] == arr[start] && arr[mid] == arr[end] ){
                //skip the duplicates

                //note : but if these elements were the pivot?
                //check this

                if(arr[start] > arr[start+1]){
                    return start;
                }
                start ++;

                //check end 
                if(arr[end] <arr[end-1]){
                    return end -1;
                }
                end--;
            }
            // left side is sorted so pivot should be in right
            else if(arr[start] <arr[mid] || (arr[start] == arr[mid] && arr[mid] >arr[end])){
                start = mid +1;
            } else{
                end = mid -1;
            }

        }
        return -1;
    }

   
}




// or
// class Solution {
//     public int search(int[] nums, int target) {
//         int left = 0;
//         int right = nums.length - 1;
//         while (left<=right ) {
//             int mid = left + (right - left) / 2; 
//             if (nums[mid] == target) {
//                 return mid;
//             }
//             if(nums[left]<=nums[mid]){
//                 if(nums[left]<=target && target<nums[mid]){
//                     right=mid-1;
//                 }
//                 else{
//                     left=mid+1;
//                 }
//             }
//              else{
//                 if(nums[mid]<target && target<=nums[right]){
//                     left=mid+1;
//                 }
//                 else{
//                     right=mid-1;
//                 }
//             }
//         }
//         return -1;
//     }
// }