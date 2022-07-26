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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        
        if(root==null)
            return res;
        
        q.offer(root);
        
        while(!q.isEmpty())
        {
            int level = q.size();
            List<Integer> chotu = new LinkedList<Integer>();
                
            for(int i=0; i<level; i++)
            {
                if(q.peek().left!=null)
                    q.offer(q.peek().left);
                if(q.peek().right!=null)
                    q.offer(q.peek().right);
                
                chotu.add(q.poll().val);
                
            }
            res.add(chotu);
        }
        
        
        
        
        
        return res;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
            
            
            
            
        
        
        
//         Queue<TreeNode> q = new LinkedList<TreeNode>();
//         List<List<Integer>> res = new ArrayList<List<Integer>>();
//         if(root==null)
//             return res;
        
//         q.offer(root);
        
//         while(!q.isEmpty())
//         {
//                 int level = q.size();
//             List<Integer> subList = new LinkedList<Integer>();
            
            
//             for(int i=0; i<level; i++) 
//             {
//                 if(q.peek().left != null)
//                     q.offer(q.peek().left);
//                 if(q.peek().right != null) 
//                     q.offer(q.peek().right);
                
                
//                 subList.add(q.poll().val);
//             }
            
//             res.add(subList);
//         }
//         return res;
        
    }
}