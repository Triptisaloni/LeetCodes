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
    
    public TreeNode sort(int[] a, int si, int ei)
    {
        if(si>ei)
            return null;
        
        int mid = si +(ei-si)/2;
        
        TreeNode root = new TreeNode(a[mid]);
        
        root.left = sort(a, si, mid-1);
        root.right= sort(a, mid+1, ei);
        
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) 
    {
        int n =nums.length;
        
        if(nums.length==0)
            return null;
       
        
        return sort(nums, 0, n-1);
    }
}