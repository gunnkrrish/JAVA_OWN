package DSA;

public class LS_Leetcode_1672 {
    public static void main(String[] args) {
        
    }
    public int maxwealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int rowsum=0;
            for(int j=0;j<accounts[i].length;j++){
                rowsum = rowsum + accounts[i][j];
            }
            //now we haves sum of account of person
            if(rowsum>ans){
                ans = rowsum;
            }
        }
        return ans;
    }


    //or

    public int maxwealth2(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for(int[] ints : accounts){
            int rowsum=0;
            for(int anInt : ints){
                rowsum = rowsum + anInt;
            }
            //now we haves sum of account of person
            if(rowsum>ans){
                ans = rowsum;
            }
        }
        return ans;
    } 
}
