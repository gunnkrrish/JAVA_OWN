package DSA.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class sizeMaxSumHeight{
   //static int size=0;
    public static class Node{
        int val;
        Node left; //null
        Node right; // null

        public Node(int val){
           this.val = val; 
        }
    }
    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        //  size++;
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root == null) return;
        
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root == null) return;
        
        postorder(root.left);
        
        postorder(root.right);
        System.out.print(root.val+" ");
    }

    public static void nthLevel(Node root,int n){
        if(root == null) return;
        if(n==1) {
            System.out.print(root.val+" " );
            return;
        }
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
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
    public static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a,Math.max(b,c));

    }

    public static int mul(Node root){
        if(root == null) return 1;
        return root.val*mul(root.left)*mul(root.right);
    }
    public static int height(Node root){
       if(root == null) return 0;
       if(root.left == null && root.right == null) return 0;
       return 1+Math.max(height(root.left), height(root.right)) ;
    }
    public static int sum(Node root){
        if(root == null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public static int size(Node root){
        if(root == null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static void main(String[] args) {
        
        Node root = new Node(1);
         Node a = new Node(2);
         Node b = new Node(3);
         root.left = a;
         root.right = b;
         Node c = new Node(4);
         Node d = new Node(5);
         a.left = c;
         a.right = d;
         Node e = new Node(6 );
        Node f = new Node(7);
         b.left = e;
         b.right = f;

         //preorder(root); 
         //inorder(root);
         //postorder(root);
        //  System.out.println(size);

        // System.out.println(size(root) );
        // System.out.println(sum(root));
        // System.out.println(max(root));
        // System.out.println(height(root));
        // System.out.println(mul(root));

       // nthLevel(root, 2);

        // to print whole
        // int level = height(root)+1;
        // for(int i=1;i<=level;i++){
        //     nthLevel(root, i);
        //     System.out.println();
        // }

        bfs(root);

    }
}






//543 leetcode
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
//     public static int height(TreeNode root){
//        if(root == null) return 0;
//        if(root.left == null && root.right == null) return 0;
//        return 1+Math.max(height(root.left), height(root.right)) ;
//     }
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root ==null) return 0;
//         if(root.left == null && root.right == null) return 0;
//         int leftAns = diameterOfBinaryTree(root.left);
//         int rightAns = diameterOfBinaryTree(root.right);
//         int mid = height(root.left)+height(root.right);
//          if(root.left != null) mid++;
//         if(root.right != null) mid++;
//         int max = Math.max(leftAns,Math.max(rightAns,mid));
//         return max;
        
//     }
// }