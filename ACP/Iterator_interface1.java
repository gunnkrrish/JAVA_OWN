package ACP;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_interface1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        Iterator<Integer> i = al.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
