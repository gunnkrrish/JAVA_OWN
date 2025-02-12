package DSA;

public class leetcode_2319 {
    public static void main(String[] args) {
        int[][] grid = {{5,0,0,1},{0,4,1,5},{0,5,2,0},{4,1,0,2}};
        System.out.println(checkXMatrix(grid));
        
    }
    static boolean checkXMatrix(int[][] grid) {
        
            int k=0;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[i].length;j++){
                    if(i==j || i+j == (grid.length-1)){
                        if(grid[i][j] ==0){
                            return false;
                        }
                        
                    }
    
                    else{
                        if(grid[i][j] != 0){
                            return false;
                        }
                        
                    }
                    
                }
            }
            return true;
        } 
        
    }

