package DSA;
import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for(int i=0;i<arr.length;i++){
            swapped = false;
            for(int j=1;j<arr.length -i;j++){
                if(arr[j] <arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if you dont swap it means array is sorted
            if(!swapped)  //!false = true
            break;
        }
    }
}
