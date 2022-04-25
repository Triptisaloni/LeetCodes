class Solution {
    public int calculate(String s) 
    {
        if(s.isEmpty())
            return 0;
        
        int n= s.length();
        
        int result=0, sign =1;
        
        Stack<Integer> p = new Stack<>();
        
        for(int i=0; i<n; i++)
        {
            char c = s.charAt(i);
            
            if(c==' ')
                continue;
            
            if(Character.isDigit(c))
            {
                int sum = c - '0';
                
                while(i+1<n && Character.isDigit(s.charAt(i+1)))
                {
                    sum= sum*10 + s.charAt(i+1)-'0';
                    i++;
                }
                result = result + sum*sign;
            }
            
            else if(c=='+')
                sign=1;
            else if(c=='-')
                sign =-1;
            
            else if(c=='(')
            {
                p.push(result);
                p.push(sign);
                
                
                result=0;
                sign =1;
            }
        
            else if(c==')')
            {
               int prevsign= p.pop();
                int prevres = p.pop();
                
                result = result*prevsign  + prevres;
            }
    }
        
        return result;
}}