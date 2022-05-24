class Solution {
    public int longestValidParentheses(String s) {
        
        int n= s.length();
        
        if(n<=1)
            return 0;
        
        Stack<Integer> st = new Stack<>();
        // int count =0;
        int maxx = 0;
        st.push(-1);
        
        
        for(int i=0; i<n; i++)
        {
            char c = s.charAt(i);
            
           if(c=='(')
               st.push(i);
            else
            {
                st.pop();
                if(st.isEmpty())
                    st.push(i);
                else
                    maxx= Math.max(maxx, i-st.peek());
            }
            
        }
        
        return maxx;
    }
}



// class Solution {
// 	public int longestValidParentheses(String s) {
        
// 		 int max_valid = 0;
// 		 Stack<Integer> stack = new Stack<Integer>();
// 		 stack.push(-1);

// 		for(int i =0 ; i< s.length() ;i++)
// 		{
// 			if(s.charAt(i) == '(')
// 				stack.push(i);
// 			else
// 			{
// 			   stack.pop();
                
// 			   if(stack.empty()) 
//                    stack.push(i);
// 			   else
// 				  max_valid = Math.max(max_valid , i-stack.peek());
// 			}
// 		}
// 		return max_valid;
// 	}
// }