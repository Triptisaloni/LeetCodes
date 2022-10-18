class Solution {
    public String countAndSay(int n) 
    {
        if(n==1)
            return "1";
        
        String prev = countAndSay(n-1);
        int prevSize = prev.length();
        String ans="";
        
        for(int i=0; i<prevSize; i++)
        {
            int count=1;
            
            while(i+1<prevSize && prev.charAt(i)==prev.charAt(i+1))
            {
                i++;
                count++;
            }
            
            ans+=count;
            ans+=prev.charAt(i);
        }
        
        
        return ans;
    }
    
}