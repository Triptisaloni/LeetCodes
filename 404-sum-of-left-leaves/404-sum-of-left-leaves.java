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
    
    public int sum(TreeNode root, boolean flag)
    {
        if(root==null)
            return 0;
        if(flag && root.left==null && root.right==null)
            return root.val;
        
        return sum(root.left , true)+sum(root.right, false);
    }
    
    public int sumOfLeftLeaves(TreeNode root) {
        
       return sum(root, false);
    }
}