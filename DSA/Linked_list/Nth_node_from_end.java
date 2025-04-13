package DSA.Linked_list;

public class Nth_node_from_end {
    public static Node nthNode(Node head, int n){
        int size =0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int m = size-n+1;   //ap : m-n+1 (m==size n=index of which to found)
        //mth node from start
        temp = head; 
        for(int i=1;i<=m-1;i++){
            temp = temp.next;
        }
        return temp;
    }

    //using only one traversal

    public static Node nthNode2(Node head , int n){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        while(fast !=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static Node remove(Node head,int idx){

        Node slow = head;
        Node fast = head;
        for(int i=1;i<=idx ;i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        //slow.data = slow.next.data;
        slow.next = slow.next.next;
        return head;
    }
    public static void display(Node head){
        Node temp = head;
        while (temp!= null) {       // agr hum isse frse copy krke 2nd tym run krenge to kuch bhi ouput ni ayega kyuki isme temp ab null ho chuka h
            System.out.print(temp.data+" ");
            temp = temp.next;
        }         
}
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }

    }
   public static void main(String[] args) {
    Node a = new Node(5);
    Node b = new Node(3);
    Node c = new Node(9);
    Node d = new Node(8);
    Node e = new Node(16);
    a.next =b;
    b.next = c;
    c.next = d;
    d.next = e;
    // Node q = nthNode2(a,3);
    // System.out.println(q.data);

    a = remove(a, 5);
    display(a);

     
    


   }
}
