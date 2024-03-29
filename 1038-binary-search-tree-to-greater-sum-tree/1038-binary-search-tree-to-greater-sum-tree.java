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

        public TreeNode bstToGst(TreeNode root) {
        reversedInorder(root, new TreeNode(0));
        return root;
    }
    private void reversedInorder(TreeNode node, TreeNode sum) {
        if (node == null) { return; }
        reversedInorder(node.right, sum);
        sum.val += node.val;
        node.val = sum.val;
        reversedInorder(node.left, sum);
    }

}