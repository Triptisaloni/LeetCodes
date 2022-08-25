class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        // if(ranSomNote)
        HashMap<Character, Integer> map = new HashMap<>();
        
        char[] m= magazine.toCharArray();
        char[] r= ransomNote.toCharArray();
        
        for(char c : m)
        {
            if(map.containsKey(c))
                map.put(c, map.get(c)+1);
            else
                map.put(c, 1);
        }
        
        for(char c: r)
        {
                if(map.containsKey(c))
                {
                    if(map.get(c)==0)
                        return false;
                    else
                        map.put(c, map.get(c)-1);
                }
            else
                return false;
        }
        
        return true;
    }
}