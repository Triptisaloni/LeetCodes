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
    static int count;
    public void help(TreeNode root, int max)
    {
        
        if(root==null)
            return;
        
        if(root.val>= max)
        {   count++;
        max = root.val;
        }
        
        help(root.left, max);
        help(root.right, max);
        
    }
    
    
    public int goodNodes(TreeNode root) 
    {
        if(root==null)
            return 0;
        
        count=0;
        help( root, Integer.MIN_VALUE );
        
        return count;

    }
}