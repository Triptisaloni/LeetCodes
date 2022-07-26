class Solution {
    public int longestPalindrome(String s) {
        
        if(s.length()==1)
            return 1;
        
          int[] letters = new int['z'-'A'+1];
        
        char[] st = s.toCharArray();
        
        for (char c : st)
            letters[c - 'A']++;
        
        int result = 0;
        
        for(int i : letters)
            result+= (i/2)*2;
            
        if (result < s.length()) 
            result++;
        
        return result;
    }
}