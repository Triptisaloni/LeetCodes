import java.util.*;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        
        Stack<Integer> s= new Stack<>();
        
        int i=0;
        int pu =0;
        
        while(i<popped.length)
        {
            
            while(pu<pushed.length && (s.size()==0 ||  popped [i]!=s.peek()))
            {
                s.push(pushed[pu]);
                pu++;
            }
            
            if(s.isEmpty()  || s.peek()!= popped[i])
            return false;
      
            s.pop();
            i++;
            
            
        }
        
        if(s.size()!=0)
            return false;
        
        return true;
    }
}