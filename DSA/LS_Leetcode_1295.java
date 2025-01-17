package DSA;

public class LS_Leetcode_1295 {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        //System.out.println(findNumbers(nums));

        System.out.println(digits2(-345678));
    }
    static int findNumbers(int[] nums){
        int count =0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    //function to check even digits or not
    static boolean even(int num){
        int numberofdigits = digits(num);
        return numberofdigits %2 ==0;
    }
// count number of digits in a number
    static int digits(int num){

    if(num<0){
        num = num * (-1);
    }
    if(num==0){
        return 1;
    }
    int count =0;
    while(num>0){
        count++;
        num=num/10;
    }
    return count;
    }

    //optimize way
    static int digits2(int num){
        if(num<0){
            num = num * (-1);
        }
        return (int)(Math.log10(num)+1);
    }
}
