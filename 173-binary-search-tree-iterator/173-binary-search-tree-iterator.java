class BSTIterator {
    
    Stack<TreeNode> stack; 

    public BSTIterator(TreeNode root) {
        stack = new Stack() ; 
        pushLeftArmToStack(root) ;
    }
    
    public int next() {
        TreeNode node = stack.pop() ;
        pushLeftArmToStack(node.right) ;
        return node.val; 
    }
    
    public boolean hasNext() {
        return !stack.isEmpty() ;
    }
    
    private void pushLeftArmToStack(TreeNode node) {
        while(node != null) {
            stack.push(node) ;
            node = node.left; 
        }
    }
}