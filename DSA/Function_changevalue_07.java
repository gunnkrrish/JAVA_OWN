package DSA;

import java.util.Arrays;

public class Function_changevalue_07 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));

        String name = "gunn";
        changename(name);
        System.out.println(name);   //here only gunn will be printed becaz it is not passed by refrence and strings are immutable
    }
    static void changename(String naam){
        naam = "gunn khurana";
    }
    static void change(int[] nums){
        nums[0] =99;    
        //if you want a change to the object via tha ref var,same object will be changed

    }
}
