package DSA;

public class leetcode_1475 {
    public static void main(String[] args) {
        int[] prices = {10,1,1,6};
        int[] total=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            total[i] = prices[i];
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>=prices[j]){
                    total[i] = prices[i]-prices[j];
                    break;
                }  
            } 
        }
        for(int i=0;i<total.length;i++){
        System.out.println(total[i]);
        }
    }
}
