package DSA;

import java.util.Arrays;

public class leetcode_2022 {
    public static void main(String[] args) {
        int[] og = {1,2,3,4};
        System.out.println(Arrays.deepToString(construct2DArray(og, 2, 2)));
    }
    static int[][] construct2DArray(int[] original, int m, int n) {
                int arr[][]=new int[m][n];
                if(original.length!=m*n){
                    return new int[0][0];
                }
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        arr[i][j]=original[i*n+j];
                    }
                }
                return arr;
            }
        
    }

