package DSA.Linked_list;

public class Doubly_ll {
    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayrev(Node tail){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display2(Node random){
        Node temp = random;
        while(temp.prev != null){
            temp = temp.prev;
        }
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node insertAtHead(Node head,int x){
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }
    public static void insertAtTail(Node Tail,int x){
        Node t = new Node(x);
        t.prev = Tail;
        Tail.next = t;
        Tail = t;
    }
    public static void insertAtidx(Node head , int idx ,int x){
        Node temp = head;
        for(int i=1;i<= idx-1;i++){
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next.prev = t;
        t.next = temp.next;
        temp.next = t;
        t.prev = temp;

    
    }
    public static Node deleteathead(Node head){
        head = head.next;
        head.prev = null;
        return head;
    }
    public static void deleteattail(Node tail){
       Node temp = tail;
       temp = temp.prev;
       temp.next = null;
    }
    public static void deleteatindx(Node head,int indx){
        Node temp = head;
        for(int i= 1;i<=indx -1;i++ ){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }
public static boolean palindrome(Node head){
    Node temp = head;
    while(temp.next != null){
        temp = temp.next;
    }
    while(head != temp){
        if(head.val != temp.val) return false;

        head = head.next;
        temp = temp.prev;
    }
    return true;
}

public static void twosum(Node head,int target){
    Node temp = head;
    Node h = head;
    while(temp.next != null){
        temp = temp.next;
    }
    while(h.val < temp.val){
        if(h.val + temp.val == target) {
            System.out.println(h.val +" "+temp.val);
            break;
        }
        else if(h.val+temp.val > target){
            temp = temp.prev;
        }
        else{
            h = h.next;
        }
    }
}

    public static void main(String[] args) {
        Node a = new Node(0);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(3);
        Node e = new Node(4);
        Node f = new Node(10);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next =c;
        c.prev = b;
         c.next = d;
        d.prev = c;
        d.next =e;
        e.prev = d;
        e.next = f;
        f.next = null;
        f.prev = e;
        // display(a);
        // displayrev(e);

        //display2(c);
        // Node newhead = insertAtHead(a, 35);
        // display(newhead);

       
        // insertAtTail(e, 35);
        // display(a);

        // insertAtidx(a, 2, 79);

    //    Node n =  deleteathead(a);
    //     display(n);

    // deleteattail(e);

    //deleteatindx(a, 2);
    //System.out.println(palindrome(a));
    //display(a);

    twosum(a, 6);

    }
}



class ListNode {
    int val;
    ListNode next, prev;
    
    ListNode(int val) {
        this.val = val;
        this.next = this.prev = null;
    }
}



//CRITICAL POINT MAX AND MIN DISTANCE
// class Solution {
//     public int[] findCriticalPoints(ListNode head) {
//         if (head == null || head.next == null || head.next.next == null) {
//             return new int[]{-1, -1};  // Not enough nodes for critical points
//         }

//         ListNode prev = head;
//         ListNode curr = head.next;
//         int index = 1;  // Position tracker
//         int firstCP = -1, lastCP = -1, prevCP = -1;
//         int minDist = Integer.MAX_VALUE; // Track minimum distance

//         while (curr.next != null) {
//             // Check if current node is a peak or a trough
//             if ((curr.val > prev.val && curr.val > curr.next.val) || 
//                 (curr.val < prev.val && curr.val < curr.next.val)) {

//                 if (firstCP == -1) {
//                     firstCP = index;  // Store first critical point
//                 } else {
//                     int diff = index - prevCP;
//                     if (diff < minDist) {  // Use only `+` and `-`
//                         minDist = diff;
//                     }
//                 }

//                 prevCP = index; // Update previous critical point
//                 lastCP = index;  // Update last critical point
//             }

//             prev = curr;
//             curr = curr.next;
//             index++;
//         }

//         if (firstCP == lastCP) {
//             return new int[]{-1, -1};  // Only one critical point, no valid distances
//         }

//         int maxDist = lastCP - firstCP;  // Max distance = first to last CP
//         return new int[]{minDist, maxDist};  // Return both min and max distances
//     }
// }
