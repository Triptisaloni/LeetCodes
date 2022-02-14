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
    public int maxDepth(TreeNode root) {
        
        if(root == null)
			return 0;
		
		int max =0;
        
        if(root.left==null && root.right==null)
            return 1;
        else if(root.left==null)
		    max = Math.max(max, maxDepth(root.right));
         else if(root.right==null)
		    max = Math.max(max, maxDepth(root.left));
        else
            max=  Math.max(max, Math.max(maxDepth(root.left), maxDepth(root.right)));
        
		// count = count+ max;
		return max+1;

    }
}