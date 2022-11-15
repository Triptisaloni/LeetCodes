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
    public int countNodes(TreeNode root) 
    {
         int LHeight=0, RHeight=0;
        TreeNode l=root, r=root;
        
        for(; l!=null; ++LHeight, l=l.left);
        for(; r!=null; ++RHeight, r=r.right);
        
        return LHeight==RHeight ? (int)Math.pow(2, RHeight)-1 
            : 1+countNodes(root.left) + countNodes(root.right);
    }
}