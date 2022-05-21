import java.util.*;

class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> help = new Stack<>();
        int n= s.length();
        
        
        if(n==1)
            return s;
        
        help.add(s.charAt(0));
        
        for(int i=1; i<n; i++)
        {
            char c = s.charAt(i);
                
            if(!help.isEmpty() && c==help.peek())
                help.pop();
            
            else
                help.push(c);
         
               }
        
        StringBuilder sb = new StringBuilder();
        for(char c : help)
            sb.append(c);
        
        return sb.toString();
    }
}