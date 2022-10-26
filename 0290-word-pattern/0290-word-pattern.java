class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character, String> map = new HashMap<>();
      
        
        int n = pattern.length();
        String[] arr = s.split(" ");
        
          if(pattern.length()!= arr.length)
            return false;
        
        for(int i=0; i<n; i++)
        {
            char c = pattern.charAt(i);
            
            if(map.containsKey(c))
            {
                if(!map.get(c).equals(arr[i]))
                    return false;
            }
            else if (map.containsValue(arr[i])) 
            return false;
            else
                map.put(c, arr[i]);
                
        }
        
        return true;
    }
}