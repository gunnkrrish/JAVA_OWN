package DSA;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//************************you can input as much ignoring internal capacity */
        // list.add(67);
        // list.add(68);
        // list.add(69);
        // list.add(62);

       //System.out.println(list.contains(67));

       //list.set(0,99);

        // list.remove(2);
        //System.out.println(list);

        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));  //pass index here,list[index] syntax will not work here
        }
    }
    
}

// size is fixed internally but arraylist filled by some amount it will create arraylist of double size and old elements copied in new one old one is deleted
