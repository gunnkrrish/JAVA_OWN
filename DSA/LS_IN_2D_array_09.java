package DSA;

import java.util.Arrays;

public class LS_IN_2D_array_09 {
    public static void main(String[] args) {
        int [][] arr={
            {2,3,45},{4,5,67},{6,7,78},{7,8,23,24}
        };
        int target =23;
        int[] ans = search(arr,target); //format of return value is [row,col]
        System.out.println(Arrays.toString(ans));

        System.out.println(max1(arr));
    }

    static int[] search(int[][] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max1(int[][] arr){
        int max = Integer.MIN_VALUE;
        System.out.println(max);
        for(int[] ints : arr){
            for(int element : ints){
                if(element>max){
                    max = element;
                }
            }
        }
        return max;
    }
    
}

