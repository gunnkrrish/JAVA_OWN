package ACP;
import java.util.ArrayList;
import java.util.Collections;
public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add
        list.add(23);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get
        System.out.println(list.get(2));

        //add el in between
        list.add(1,34);  //index,element
        System.out.println(list);

        //set elemnt
        list.set(0,5);
        System.out.println(list);
 
        //delete
        list.remove(2);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        
        //sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
