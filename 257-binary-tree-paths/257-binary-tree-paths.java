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
        public static List<String> binaryTreePaths(TreeNode root)
    {
        ArrayList<String> list=new ArrayList<>();
        paths(root,"",list);
        return list;
    }
    
    
    public static void paths(TreeNode root,String subpath,List<String> list)
    {
        if (root.left == null && root.right == null)
        {
            list.add(subpath+root.val);
            return;
        }
        
        
        if (root.left!=null)
            paths(root.left, subpath+root.val+"->", list);
        if (root.right!=null)
            paths(root.right, subpath+root.val+"->", list);
    }
}