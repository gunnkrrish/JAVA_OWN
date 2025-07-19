package ACP;

import java.util.function.Predicate;

//joining predicates - and,or,negate

//p1 -- checks number is even
//p2 -- checks greater then 50

public class lambda6 {
    public static void main(String[] args) {
        int[] arr = {5,15,24,96,7,8,34,56,89};
        Predicate<Integer> p1=(i)->(i%2==0);
        Predicate<Integer> p2=(j)->(j>50); 

        //and
        // for(int n:arr){
        //     //if(p1.test(n) && p2.test(n))
        //     if(p1.and(p2).test(n))
        //     {
        //         System.out.println(n);
        //     }  
        // }

        //or
        // for(int n:arr){
        //     //if(p1.test(n) || p2.test(n))
        //     if(p1.or(p2).test(n))
        //     {
        //         System.out.println(n);
        //     }  
        // }


        //negate
        for(int n:arr){
            //if(p1.test(n) && p2.test(n))
            if(p1.negate().test(n))
            {
                System.out.println(n);
            }  
        }
    }
}
