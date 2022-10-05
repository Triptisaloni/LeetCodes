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
    
    public void help(TreeNode root, int val,int d,int depth)
    {
        if(root==null)
            return;
        
            if(d<depth-1)
            {
             help(root.left, val, d+1, depth);
             help(root.right, val, d+1, depth);
            }
        else
        {
             TreeNode temp = new TreeNode(val);
             TreeNode ptr = root.left;
            root.left = temp;
            root.left.left = ptr;
            
            TreeNode pt = root.right;
            root.right = new TreeNode(val);
            root.right.right = pt;
        }
                
    }
    
    public TreeNode addOneRow(TreeNode root, int val, int depth) 
    {
        if(depth==1)
        {
            TreeNode temp = new TreeNode(val);
            temp.left= root;
            return temp;
        }
        
        help(root, val, 1, depth);
        
        return root;
    }
}