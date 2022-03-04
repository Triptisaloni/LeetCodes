import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(t.length()!=s.length())
            return false;
        
        HashMap<String, String> map = new HashMap<>();
        
            for(int i=0; i<s.length(); i++)
            {
                String a =""+s.charAt(i);
                String b = ""+t.charAt(i);
                
                if(map.containsKey(a))
                {
                    String val = map.get(a);
                    if(b.charAt(0)!=val.charAt(0))
                        return false;
                }
               else if(map.values().contains(b))
                   return false;
                
                else
                map.put(a,b);
            }
        return true;
    }
}