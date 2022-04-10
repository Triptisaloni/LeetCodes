class Solution {
    public int calPoints(String[] ops) {
        
        Stack<Integer> s= new Stack<>();
        
        for(int i=0; i<ops.length; i++)
        {
            if(ops[i].equals("C"))
            {   if(!s.isEmpty())
                s.pop();
            }
            
            else if(ops[i].equals("D"))
            {
                int top = s.peek();
                s.push(top*2);
                
            }
            
            else if(ops[i].equals("+"))
            {
                int size = s.size();
                
                int top1 = s.get(size-1);
                int top2= s.get(size-2);
                
                s.push(top1+top2);
            }
            
            else
            {
                int p = Integer.parseInt(ops[i]);
                s.push(p);
            }
        }
        
    
        int sum =0;
        
        while(!s.isEmpty())
            sum+=s.pop();
        
        return sum;
    }
}