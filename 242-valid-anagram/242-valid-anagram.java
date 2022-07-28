class Solution {
    public boolean isAnagram(String s, String t) {
        
        int sl = s.length(), tl = t.length();
        if(sl!=tl)
            return false;
        
        char[] ss = s.toCharArray();
        char[] tt= t.toCharArray();
        
        Arrays.sort(ss);
        Arrays.sort(tt);
        
        for(int i=0; i<sl;i++)
            if(ss[i]!=tt[i])
                return false;
        
        return true;
    }
}