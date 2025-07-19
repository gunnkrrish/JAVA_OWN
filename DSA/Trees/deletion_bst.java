package DSA.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class deletion_bst {
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
     public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root, ArrayList<Integer> arr){
        if(root==null) return;
        
        inorder(root.left,arr);
       arr.add(root.val);
        inorder(root.right,arr);
        
    }
    public static void delete(Node root,int target){
        //for leaf node
        if(root == null) return;
        if(root.val>target) {
            if(root.left == null) return;
            if(root.left.val == target) {
                Node l = root.left;
                if(root.left.left==null && root.left.right==null){
                    root.left = null;
                }//0 child
                else if(l.left == null || l.right == null)
                if(l.left != null) root.left = l.left;
                else root.left = l.right;
            }
            else {
                delete(root.left, target);
            }
        }
        else {
            if(root.right == null) return;
            if(root.right.val == target) {
                Node r = root.right;
                if(r.left == null && r.right == null) root.right = null;
                else if(r.left == null || r.right == null){
                    if(r.left != null) root.right= r.left;
                    else root.left = r.right;
                }
            }
            else delete(root.right, target);
        }

        

    }
    public static void main(String[] args) {
        String[] a = {"50","20","60","17","34","55","89","10","","28","","","","70","","","14"};
        Node root = constructbfs(a);
        // preorder(root);
        // System.out.println();
        // delete(root,34);
        // preorder(root);

        //to find predeccor and succesor
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        int val = 28;
       int idx = -1;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) == val){
                idx = i;
                break;
            }
        }
        System.out.println("pred is : " + arr.get(idx -1));
        System.out.println("succ is : " + arr.get(idx +1));
        

        ///////one more method in pred_bst.java
        
    }
}
