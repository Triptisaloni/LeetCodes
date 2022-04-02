class Solution {
    
    public boolean help(String s, int i, int j)
    {
        while(i<=j)
        {
           if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            } 
            else
                return false;
        }
        
        return true;
    }
    public boolean validPalindrome(String s) {
        
        int n= s.length();
        
        int l =0; 
        int r =n-1;
        
        while(l<=r)
        {
            if(s.charAt(l)==s.charAt(r))
            {
                l++;
                r--;
            }
            
            else
                return help(s, l+1, r) || help(s,l,r-1);
        }
        return true;
        
    }
}