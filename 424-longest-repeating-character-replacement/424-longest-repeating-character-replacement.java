class Solution {
    
    public int characterReplacement(String s, int k) 
    {
        int l = 0;
        int[] count = new int[26];
        int maxf = 0;
        int max = 0;
        
        for(int r = 0; r < s.length(); r++)
        {
            int current_char = s.charAt(r) - 'A';
            count[current_char]++;
            
            maxf = Math.max(maxf, count[current_char]);
            
            while(r - l + 1 - maxf > k)
            {  
                count[s.charAt(l) - 'A']--;
                l++;
            }
            
            max = Math.max(max, r - l + 1);
            
        }
        return max;
    }
}