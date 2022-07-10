class Solution {
    public String longestCommonPrefix(String[] strs)
    {
        
        int n = strs.length;
        
        if(n==0)
            return "";
        if(n==1)
            return strs[0];
        
        String pre = strs[0];
        
        
        for(int i=1; i<n; i++)
        {
            String temp ="";
            int j=0;
            
            while(j< strs[i].length() &&  j<pre.length() && pre.charAt(j) == strs[i].charAt(j))
            {
                temp+=pre.charAt(j);
                j++;
            }
            
            if(temp=="")
                return temp;
            pre = temp;
        }
        
        return pre;
    }
}