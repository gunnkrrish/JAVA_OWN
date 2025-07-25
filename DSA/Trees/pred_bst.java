package DSA.Trees;

import java.util.LinkedList;
import java.util.Queue;
public class pred_bst {
     static int pred = -1;
      static  int suc = -1;
      static Node temp = null;
      static boolean flag = false;
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static Node constructbfs(String[] arr){
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i=1;
        while(i<n-1){
            Node temp = q.remove();
            Node left = new Node(10);
            Node right = new Node(100);
            if(arr[i].equals("")) left = null;
            else{
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if(arr[i+1].equals("")) right = null;
            else{
                int r = Integer.parseInt(arr[i+1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i+=2;
        }
        return root;
    }
    public static void inorder(Node root,int val){
        if(root==null) return;
        
        inorder(root.left,val);
       //mainn
       if(temp == null) temp = root;
       else{
        if(root.val == val){
         pred = temp.val;
        flag = true;
        } 
        else if(root.val> val && flag == true){
            suc = root.val;
            flag = false;
        }
        else{
            temp = root;
        }

       }

        inorder(root.right,val);
        
    }
   
       public static void main(String[] args) {
        String[] a = {"50","30","70","20","40","60","80"};
        Node root = constructbfs(a);
       
        
        int val = 30;
        inorder(root,val);
        System.out.println(pred);
        System.out.println(suc);
     
        
    }


}
