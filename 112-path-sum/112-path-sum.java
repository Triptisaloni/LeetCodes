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
    
    public boolean isLeaf(TreeNode root)
    {
        if(root.left==null && root.right==null)
            return true;
        
        return false;
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) 
    {
        if(root == null)
            return false;
        if(isLeaf(root))
        {
            if(targetSum==root.val)
                return true;
            else
                return false;
        }
        
        targetSum-=root.val;
        
        boolean left = hasPathSum(root.left, targetSum);
        boolean right = hasPathSum(root.right, targetSum);
        
        return left||right;
    }
}