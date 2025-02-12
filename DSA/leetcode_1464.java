package DSA;

public class leetcode_1464 {
    public static void main(String[] args) {
        int[] nums = {10,2,5,2};
        int largest = (nums[0]-1)*(nums[1]-1);
        int seclarge=0;
        for(int i=0;i<nums.length;i++){
            for(int j= i+1;j<nums.length;j++){
                seclarge= (nums[i]-1)*(nums[j]-1);
                if(seclarge >largest){
                    largest = seclarge;
                }
                else{
                    continue;
                }
            }
            
        }
        System.out.println(largest);
    }
}
