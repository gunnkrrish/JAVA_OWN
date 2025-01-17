package DSA;

public class LS_find_min_09 {
    public static void main(String[] args) {
        int [] arr = {18,12,-7,-6,-8,3,14,28};
            System.out.println(min(arr));
        
    }
    static int min(int[] arr){
        int low = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<low){
                low= arr[i];
            }
        }
        return low;
    }

}
