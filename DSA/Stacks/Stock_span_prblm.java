/*The stock span problem is a financial problem where we have a series of daily price quotes for a stock 
and we need to calculate the span of stock price for all days. The span arr[i] of the stocks price on a given 
day i is defined as the maximum number of consecutive days just before the given day, for which the price of 
the stock on the given day is less than or equal to its price on the current day.

Examples:

Input: arr[] = [100, 80, 60, 70, 60, 75, 85]
Output: [1, 1, 1, 2, 1, 4, 6]
Explanation: Traversing the given input span 100 is greater than equal to 100 and there
 are no more elements behind it so the span is 1, 80 is greater than equal to 80 and smaller 
 than 100 so the span is 1, 60 is greater than equal to 60 and smaller than 80 so the span is 1,
  70 is greater than equal to 60,70 and smaller than 80 so the span is 2 and so on. 
   Hence the output will be 1 1 1 2 1 4 6.
Input: arr[] = [10, 4, 5, 90, 120, 80]
Output: [1, 1, 2, 4, 5, 1]
Explanation: Traversing the given input span 10 is greater than equal to 10 and 
there are no more elements behind it so the span is 1, 4 is greater than equal to 4
 and smaller than 10 so the span is 1, 5 is greater than equal to 4,5 and smaller than 
 10 so the span is 2,  and so on. Hence the output will be 1 1 2 4 5 1.*/



package DSA.Stacks;
import java.util.*;
public class Stock_span_prblm {
    public static int[] calculateSpan(int price[] , int n){
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        ans[0] =1;
        for(int i=1;i<n;i++){
            while(st.size()>0 && price[st.peek()] < price[i]){
                st.pop();
            }
            if(st.size()>0) ans[i] = i-st.peek();
            else ans[i] = i+1;
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {100, 80, 60, 70, 60, 75, 85};
        int[] res = calculateSpan(arr, 7);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }

    }
}
  

//84 leetcode doubt
