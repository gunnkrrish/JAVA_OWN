package DSA.Linked_list;

public class Circular {
    public static class Node{
        int val;
        Node next;
       

        Node(int val){
            this.val = val;
        }
    }
    public static Node delete(Node head){
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        head = head.next;
        return head;
    }
   public static void display(Node head){
    Node temp = head.next;
    System.out.print(head.val+" ");
    while(temp != head){
        System.out.print(temp.val+" ");
        temp = temp.next;
    }
   }
    public static void main(String[] args) {
        
            Node a = new Node(4);
            Node b = new Node(10);
            Node c = new Node(2);
            Node d = new Node(99);
            Node e = new Node(13);
    
           
            a.next = b;
           
            b.next =c;
            
             c.next = d;
           
            d.next =e;
           
            e.next = a;

            Node o = delete(a);
            display(o);
    }
}
