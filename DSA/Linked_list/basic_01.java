 package DSA.Linked_list;

public class basic_01 {

    //if only head is given
    public static void insertAtEnd(Node head,int val){
        Node temp = new Node(val);
        Node t = head;
        while(t.next!=null){
            t = t.next;
        }       
        t.next = temp;
    }
    public static void displayr(Node head){
        if(head == null) return;
        System.out.println(head.data);
        displayr(head.next);
    }

 public static void displayreverse(Node head){
        if(head == null) return;
        displayreverse(head.next);
        System.out.println(head.data);
    }
    public static void display(Node head){
            Node temp = head;
            while (temp!= null) {       // agr hum isse frse copy krke 2nd tym run krenge to kuch bhi ouput ni ayega kyuki isme temp ab null ho chuka h
                System.out.println(temp.data );
                temp = temp.next;
            }         
    }

    public static int length(Node head){
        int count =0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static class Node{
        int data;       //value
        Node next;      // address of next node

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {

        /*
        // Node x = new Node();
        // System.out.println(x.data);   //gives 0
        // System.out.println(x);       // returns file name with some xyz value
        // System.out.println(x.next);     // will return null

        */

        
        Node a = new Node(5);
        // System.out.println(a.next);   //isse abhi null ayega kyuki hmne abhi link ni kiya
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        // 5-> 3->9 ->8->16
        a.next = b;   //link krdiya
        b.next = c;
        c.next = d;
        d.next = e;
        // System.out.println(a);   // isse a ka address agya
        // System.out.println(a.next);      // isse b ka address agya
        // System.out.println(b);       // isse bhu b ka address agya

        // System.out.println(b.data);  //3
        // System.out.println(a.next.data);   //3
        // System.out.println(a.next.next.data); // c.data
        // System.out.println(a.next.next.next.data);


//DISPLAYING A LINKED LIST ***********************************************************
// we know there are only 5 elements
        // Node temp = a;
        // for(int i=1;i<=5;i++){
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }

// we dont know length
    // Node temp = a;
    // while(temp != null){
    //     System.out.println(temp.data);
    //     temp = temp.next;
    // }


    // display(a); // but agr hum isko 2 baar likhenge to 2 baar code ho jega
    // display(a);

    displayr(a);
    displayreverse(a);

    // System.out.println(length(a));

    // insertAtEnd(a,87);
    // display(a);
    }
    
}
