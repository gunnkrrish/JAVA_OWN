package DSA;

public class leetcode_509 {
    public static void main(String[] args) {
        int n =4;
        int first=0;
        int second =1;
        int sum=0;
        if(n==1){
            sum = 0;
            System.out.println(sum);
        }
        else if(n==2){
            sum = first+second;
            System.out.println(sum);
        }
        else{
            int next=0;
            for(int i=2;i<=n;i++){
                next = first+ second;
                first = second;
                second = next;
                
            }
            System.out.println(next);
        }
        
    }
}
