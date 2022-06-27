/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    
     static  ArrayList<Integer> res;
    
        public void pre(Node root)
            
        {
            if(root==null)
                return;
            
          
             res.add(root.val);
            
            if(root.children!=null)
            {
                 for(int i=0; i<root.children.size(); i++)
                 {
                     pre(root.children.get(i));
                 }
            }
        }
    
    
    public List<Integer> preorder(Node root) 
    {
                
        res = new ArrayList<Integer>();

        pre(root);
        
        return res;
    }
}