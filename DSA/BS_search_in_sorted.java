package DSA;

import java.util.Arrays;

public class BS_search_in_sorted {
    // search in sorted 2d matrix

    public static void main(String[] args) {
        int[][] matrix ={
            {1,2,3},
            {4,5,6},{7,8,9}
        };
        System.out.println(Arrays.toString(search(matrix, 6)));
    }

    // search in the row provided
    static int[] bin(int[][] matrix, int row, int cStart, int cEnd, int target) {

        while (cStart <= cEnd) {

            int mid = cStart + (cEnd - cStart) / 2; // it will not exceed, but it is a same way only as above but better
                                                    // way
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return bin(matrix, 0, 0, cols - 1, target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) {
            // while ths is true it is having 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[] { mid, cMid };
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        // now we have 2 rows
        // check wether target is in cols of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[] { rStart = 1, cMid };
        }
        // search in 1,2,3,4 half
        // 1st
        if (target <= matrix[rStart][cMid - 1]) {
            return bin(matrix, rStart,0,cMid-1, target);
        }
        // 2nd
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols-1]) {
            return bin(matrix, rStart,cMid+1,cols-1, target);
        }

        // 3rd
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return bin(matrix, rStart+1,0,cMid-1, target);
        }else{
            return bin(matrix, rStart+1,cMid+1,cols-1, target);
        }

        // 4th
        
    }

}
