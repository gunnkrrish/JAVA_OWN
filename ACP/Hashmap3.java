package ACP;
// valid anagram
import java.util.*;
public class Hashmap3 {
    static HashMap<Character,Integer> freq(String str){
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(!mp.containsKey(c)){
                mp.put(c,1);
            }
            else{
                mp.put(c,mp.get(c)+1);
            }
        }
        return mp;
    }
    public static boolean isAnagram1(String s,String t){
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> mp1 = freq(s);
        HashMap<Character,Integer> mp2 = freq(t);
        return mp1.equals(mp2);

    }
    public static boolean isAnagram2(String s,String t){
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> mp = freq(s);
        for(int i=0;i<t.length();i++){
            Character ch = t.charAt(i);
            if(!mp.containsKey(ch)){
                return false;
            }
            else{
                mp.put(ch,mp.get(ch)-1);
            }
        }
        // all values must be zero for anagram
        for(int i:mp.values()){
            if(i != 0) return false;
        }
        return true;

        

    }
    public static void main(String[] args) {
        boolean ans = isAnagram2("keen","knee");
        if(ans == true) System.out.println("valid");
        else System.out.println("not valid");
    }    
}
