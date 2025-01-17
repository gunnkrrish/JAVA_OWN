package DSA;

import java.util.Arrays;

public class Var_len_args {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,8,8);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
//var length args must be always at the end
//function overloading either no of args be differnt or type of args be different