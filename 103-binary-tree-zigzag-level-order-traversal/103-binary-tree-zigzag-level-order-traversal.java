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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
         List<List<Integer>> ans= new ArrayList<>();
        
        if(root==null)
            return ans;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean l2r = true;
        
        while(!q.isEmpty())
        {
            ArrayList<Integer>  temp = new ArrayList<>();
            
            int size = q.size();
            
            for(int i=0; i<size; i++)
            {
                TreeNode p = q.poll();
                temp.add(p.val);
               
                    if(p.left!=null)
                        q.offer(p.left);
                    if(p.right!=null)
                        q.offer(p.right);
                
            
            }
            
            if(!l2r)
                Collections.reverse(temp);
            
            ans.add(temp);
            l2r = !l2r;
            
            
        }
        
        return ans;
        
        
    }
}