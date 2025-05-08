package DSA.Queue;

import java.util.*;


public class DequeSTL {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(1);
        dq.addLast(4);
        dq.addLast(5);
        System.out.println(dq);
        // dq.addFirst(6);
        // System.out.println(dq);
        // dq.removeLast();
        // System.out.println(dq);
        // dq.removeFirst();
        // System.out.println(dq);
        // System.out.println(dq.getFirst());
        // System.out.println(dq.getLast());

        //dq.add(9);  //default at last
        // dq.remove();  //remove first
        // dq.removeAll(dq);  //removes everything
        System.out.println(dq);
        dq.removeFirstOccurrence(1);
        //dq.removeLastOccurrence(1);
        System.out.println(dq);
        


        

    }
}
