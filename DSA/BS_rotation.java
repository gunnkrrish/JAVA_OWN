package DSA;
// o(1) o(log n) o(n)  o (n log n) o(n^2) o (2^n) o(n!)
public class BS_rotation {
    public static void main(String[] args) {
        //count how many tyms arra is rotated
        //check pivot and add +1 it will give index 
        int [] arr = {4,5,6,7,0,1,2};
        System.out.println(count_rotations(arr));

    }
    static int count_rotations(int[] arr){
        int pivot = findpivot(arr);
        return pivot+1;
    }
    static int findpivot(int[] arr){
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

    
    static int findpivotwithduplicate (int[] arr){
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
