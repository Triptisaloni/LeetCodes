import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        
        int len = s.length();
        
        if(len==0)
            return true;
        Stack<Character> p = new Stack<Character>();
        
        for(int i =0; i<len ;i++)
        {
            char c = s.charAt(i);
            
            if(c=='('||c=='['||c=='{')
                p.push(c);
            else if(c==')'&& !p.isEmpty() && p.peek()=='(')
                p.pop();
            else if(c==']'&& !p.isEmpty() && p.peek()=='[')
                p.pop();
            else if(c=='}'&& !p.isEmpty() && p.peek()=='{')
                p.pop();
            else
                return false;
            
        }
        
        return(p.isEmpty());
    }
}