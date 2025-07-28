package ACP;
import java.util.*;
public class Hashmap1 {
    static void HashMapMethods(){

        //syntax
        Map<String,Integer> mp = new HashMap<>();

        //add elements
        mp.put("Akash",24);
        mp.put("Gunn",20);
        mp.put("Yash",13);
        mp.put("user",2);
        mp.put("user1",4);

        //getting value of a key
        System.out.println(mp.get("Gunn"));  // returns 20
        System.out.println(mp.get("Rahul"));   // no key with rahul so returns null

        // Changing / updating value of a key in hashmap
        mp.put("Akash",25);
        System.out.println(mp.get("Akash"));    //25
 
        //Removing a pair from the hashmap
        System.out.println(mp.remove("Akash")); //25
        System.out.println(mp.remove("Riya"));  // null

        //check if ke exists
        System.out.println(mp.containsKey("Akash")); //false
        System.out.println(mp.containsKey("Gunn")); //true

        // adding a new entry only if the new key doesnt exist alreday
        //if(!mp.containsKey("Yash")) mp.put("Yash",30);
                    //Or
        mp.putIfAbsent("Yashika", 30); //will enter
        mp.putIfAbsent("Yash", 30);  //will not enter

        //get all the keys in the hashmap
        System.out.println(mp.keySet());

        //get all the values
        System.out.println(mp.values());

        //get all entries
        System.out.println(mp.entrySet());

        //traversing all entries of hashmap - multiple methods
        
        // 1
        // for(String key: mp.keySet()){
        //     System.out.println("Age of "+key+" is "+ mp.get(key));
        // }

        // 2
        // for(Map.Entry<String,Integer> e: mp.entrySet()){
        //     System.out.println("Age of "+e.getKey()+" is "+ e.getValue());
        // }

        // 3
        // for(var e: mp.entrySet()){
        //     System.out.println("Age of "+e.getKey()+" is "+ e.getValue());
        // }


    }

    public static void main(String[] args) {
        HashMapMethods();
    }
}
