class Solution {
    public int firstUniqChar(String s) {
        
        if(s.length()==1)
            return 0;
        
        int [] alpha = new int[26];
        
        for(int i=0; i<s.length(); i++)
        {
            alpha[s.charAt(i)-'a']++;
        }
        
        int count =0;
        
        for(int i=0; i<s.length(); i++)
        {
            if(alpha[s.charAt(i)-'a']==1)
                return i;
        }
        
        return -1;
    }
}