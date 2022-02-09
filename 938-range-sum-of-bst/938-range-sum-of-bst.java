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
    
    public static int sum=0;
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        if(root==null)
            return 0;
        
        
        int data = root.val;
            
        if(data>= low && data <=high)
        {
            return data+ rangeSumBST(root.left, low, data)+rangeSumBST(root.right, data, high);
            // sum+= data;
            // // if(root.left!=null)
            // sum+= rangeSumBST(root.left, low, data);
            // sum+= rangeSumBST(root.right, data, high);
        }
        
        else if(data<low)
        {
           return rangeSumBST(root.right, low, high);
        }
        
        else if(data>high)
        {
            return rangeSumBST(root.left, low,high);
        }
        
        else
            return 0;
    }
}