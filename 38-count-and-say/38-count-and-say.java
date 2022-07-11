class Solution {
    public String countAndSay(int n) 
    {
        if(n==1)
            return "1";
        
        String s = countAndSay(n-1);
        
        String temp ="";
        
        for(int i=0; i<s.length(); i++)
        {
            int count =1;
            
            while(i+1<s.length() && s.charAt(i)==s.charAt(i+1))
            {
                i++;
                count++;
            }
            
            temp += count;
            temp += s.charAt(i);
        }
        
        return temp;
    }
}