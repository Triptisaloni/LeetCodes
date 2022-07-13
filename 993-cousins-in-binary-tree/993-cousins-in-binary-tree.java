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
    public boolean isCousins(TreeNode root, int x, int y)
    {
         if(root==null)
             return false;
        
        if(x==y) return false;
        
        Queue<TreeNode> q = new LinkedList<>();
        boolean isX= false;
        boolean isY=false;
        
        q.offer(root);
        
        while(!q.isEmpty())
        {
            isX= false; isY = false;
            
            int size  = q.size();
            
            for(int i=0; i<size; i++)
            {
                TreeNode curr = q.poll();
                
                if(curr.val== x)
                    isX=true;
                if(curr.val == y)
                    isY = true;
                
                if(curr.left != null && curr.right != null){
                    if(curr.left.val == x && curr.right.val == y)
                        return false;
                    if(curr.left.val == y && curr.right.val == x)
                        return false;
                }
                
                 if(curr.left != null)
                    q.offer(curr.left);
                if(curr.right != null)
                    q.offer(curr.right);
            }   
                if(isX && isY)
                    return true;
            // }
        }
        
        return false;
    }
}