package DSA;

import java.util.Arrays;

public class LS_in_strings_09 {
    public static void main(String[] args) {
        String name = "Gunn";
        char target = 'o';
        //System.out.println(search(name,target));

        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search(String str , char target){
        if(str.length() == 0) {     //here braces because it is a method not a var
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str , char target){
        if(str.length() == 0) {     //here braces because it is a method not a var
            return false;
        }
        for(char ch : str.toCharArray()){
            //string to array we use str.toCharArray
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}
