package DSA.Stacks;

public class Linked_list_implementaion {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLStack{
        Node head = null;
        int size =0;

            void push(int x){
                Node temp = new Node(x);
                temp.next = head;
                head = temp;
                size++;
            }
            void displayrev(){
                Node temp = head;
                while(temp!=null){
                    System.out.print(temp.val+" " );
                    temp = temp.next;
                }
                System.out.println();
            }

            void displayrec(Node head){
                if(head == null) return;
                displayrec(head.next);
                System.out.print(head.val+" ");
            }
            void display(){
                displayrec(head);
                System.out.println();
            }

            int size(){
                return size;
            }
            int pop(){
                if(head == null){
                    System.out.println("stack is empty");
                    return -1;
                }
                int x = head.val;
                head = head.next;
                return x;
            }

            int peek(){
                if(head == null){
                    System.out.println("stack is empty");
                    return -1;
                }
                
                return head.val;
            }
            boolean isEmpty(){
                if(size==0) return true;
                return false;
            }
        }

    
    public static void main(String[] args) {
       LLStack st = new LLStack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();    
        st.push(1); 
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(7);
        st.push(9);
        st.push(56);
        st.push(6); 
        st.display();  
    }     
}
