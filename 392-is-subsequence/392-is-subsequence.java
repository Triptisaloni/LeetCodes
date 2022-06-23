class Solution {
    public boolean isSubsequence(String s, String t) 
    
    {
            
        int i=0, j=0;
        int sn =s.length(), tn = t.length();
        
        while(i<sn && j<tn)
        {
            // if(i==sn)
            //     return true;
            
            if(s.charAt(i)==t.charAt(j))
            i++;
            
            j++;
        }
        
        return (i==sn);
    }
}