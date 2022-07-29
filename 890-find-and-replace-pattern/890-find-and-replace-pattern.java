class Solution {
    
    public boolean help(String word, String pattern)
    {
        HashMap<Character, Character> map = new HashMap<>();
        
        for(int i=0; i<word.length(); i++)
        {
            char w = word.charAt(i), p = pattern.charAt(i);
            if(map.containsKey(w) && map.get(w)!=p)
                return false;
            else if(!map.containsKey(w))
                map.put(w, p);  
            // if(map.getOrDefault(w,p)!=p)
            //     return false;
            // else map.put(w,p);
        }
        return true;
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
     
        ArrayList<String> ans = new ArrayList<>();
        // int n = pattern.length;
        
        for(String word: words)
        {
            if(help(word, pattern) && help(pattern,word))
                ans.add(word);
        }
        
        return ans;
    }
}