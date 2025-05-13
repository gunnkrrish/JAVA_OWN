package DSA.Trees;

public class leetcode_257 {
    
}
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
//     public void helper(TreeNode root, List<String> ans, String s){
//         if(root == null) return;

//         if(root.left == null && root.right == null){
//             s = root.val + s;  // No "->" at the end for leaf
//             ans.add(s);
//             return;
//         }

//         helper(root.left, ans, "->" + root.val + s);
//         helper(root.right, ans, "->" + root.val + s);
//     }

//     public List<String> nodeToRootPaths(TreeNode root) {
//         List<String> ans = new ArrayList<>();
//         helper(root, ans, "");
//         return ans;
//     }
// }



/*****************8in leetcode its root to node
here we have node to root */