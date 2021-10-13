// https://leetcode.com/problems/invert-binary-tree/
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
class Solution {
    public TreeNode invertTree(TreeNode root) {
         if (root==null)
            return root;
        
        //change the childs
        TreeNode child = root.left;
        root.left = root.right;
        root.right = child;
        
        //do the same for the next level of the tree
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
        
    }
}
