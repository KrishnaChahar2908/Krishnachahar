/*
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
        
        if(root == null){
            return null;
        }

        TreeNode temp = root.left;   // left and right swap 
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);      // left subtree invert 
        invertTree(root.right);     // right subtree invert 

        return root;
    }
}