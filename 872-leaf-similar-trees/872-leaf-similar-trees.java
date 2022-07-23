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
    public void help(TreeNode root, ArrayList<Integer> l)
    {
            if(root==null)
                return;
            if(root.left==null && root.right==null)
                l.add(root.val);
        
        help(root.left, l);
        help(root.right, l);
    }
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        if(root1==null && root2==null)
            return true;
        
        if(root1==null || root2==null)
            return false;
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        
        help(root1, l1);
        help(root2, l2);
        
        if(l1.size()!=l2.size())
            return false;
        
        for(int i=0; i< l1.size(); i++)
        {
            if(l1.get(i)!=l2.get(i))
                return false;
        }
        
        return true;

    }
}