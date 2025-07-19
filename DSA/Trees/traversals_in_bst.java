package DSA.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class traversals_in_bst {
      public static class Node{
        int val;
        Node left; //null
        Node right; // null

        public Node(int val){
           this.val = val; 
        }
    }
   
   
    public static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root != null) q.add(root);
        while(q.size()>0){
            Node temp = q.peek();
            if(temp.left!= null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();

        }
    } 
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
     public static void postorder(Node root){
        if(root==null) return;
        
        postorder(root.left);
        
        postorder(root.right);
        System.out.print(root.val+" ");
    }
     public static void inorder(Node root){
        if(root==null) return;
        
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void revinorder(Node root){
        if(root==null) return;
        
       inorder(root.right);
        System.out.print(root.val+" ");
        inorder(root.left);
        
    }
      
    public static void main(String[] args) {
        
        Node root = new Node(10);
         Node a = new Node(5);
         Node b = new Node(15);
         root.left = a;
         root.right = b;
         Node c = new Node(2);
         Node d = new Node(8);
         a.left = c;
         a.right = d;
         Node e = new Node(12 );
        Node f = new Node(17);
         b.left = e;
         b.right = f;
        bfs(root);

        //preorder(root);
        //postorder(root);

       // revinorder(root);
    }
}
 