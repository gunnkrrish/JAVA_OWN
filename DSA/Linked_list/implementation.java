package DSA.Linked_list;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
       Node head = null;
       Node tail = null; 

    //    int size =0;

       void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head==null){
            head = temp;
            tail=temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        // size++;
       }

       void insertAtHead(int val){
        Node temp = new Node(val);
        if(head == null){
            head = temp;
            tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        // size++;
       }

       

       void insertAt(int indx,int val){
        Node t = new Node(val);
        Node temp = head;
        if(indx == size()){
            insertAtEnd(val);
            return;
        }
        else if(indx==0){
            insertAtHead(val);
            return;
        }
        else if(indx<0){
            System.out.println("wrong index");
            return;
        }
        else if(indx >size()){
            System.out.println("wrong index");
            return;
        }
        for(int i=1;i<= indx-1;i++){
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
        // size++;
       }
       int getAt(int idx){
        if(idx<0){
            System.out.println("wrong index");
            return -1;
        }
        else if(idx >size()){
            System.out.println("wrong index");
            return -1;
        }
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.data;
        }

        void deleteAt(int idx){
            if(idx==0) {
                head = head.next;
                // size--;
                return;
            }
            Node temp = head;
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            if (temp.next == tail) {
                tail = temp;
            }
            
            temp.next = temp.next.next;
            
            // size--;
           }

       void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
       }
       int size(){          //O(n)
        Node temp = head;   //if we write size in class declartion then we dont need size;
        int count =0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
       }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtHead(7);
        ll.insertAtHead(9);
        ll.display();
        System.out.println();
        // ll.insertAt(2, 8);

        
        // ll.insertAt(4, 10); //ye insert to hojega pr tail abhi bhi 5 hi rhega
        // System.out.println(ll.tail.data);  //to resolve this add if condition in it

        // ll.insertAt(0, 23);  //ye add ni ho payega to add else if
       
        // ll.display();
        // System.out.println();
        // System.out.println(ll.size());

        // System.out.println(ll.getAt(3));

        // System.out.println(ll.size);

        ll.deleteAt(0);
        ll.display();
        // System.out.println();
        // System.out.println(ll.tail.data);
        
    }
}


