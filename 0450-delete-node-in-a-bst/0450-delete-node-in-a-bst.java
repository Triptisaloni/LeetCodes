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
    public TreeNode deleteNode(TreeNode root, int key) 
    {
        if(root == null)
            return null;
        
        if(key<root.val)
            {root.left = deleteNode(root.left, key);
                return root;
            }
        else if(key> root.val)
        {
            root.right = deleteNode(root.right, key);
            return root;
        }
        else
        {
            if(root.left==null)
                return root.right;
            if(root.right==null)
                return root.left;
            
            // finding minimum in right tree
            TreeNode min = root.right;
            while(min.left!=null)
            {
                min = min.left;
            }
             
            //exchange
            root.val = min.val;
            root.right = deleteNode(root.right, min.val);
            
            return root;
        }
    }
}