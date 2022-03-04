import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] a1 = s.toCharArray();
    char[] b1 = t.toCharArray();
    Arrays.sort(a1); Arrays.sort(b1);
    return Arrays.equals(a1, b1);
//         int m= s.length();
//         int n= t.length();
        
//         if(m!=n)
//             return false;
        
//         HashMap< String , Integer> map =new HashMap<>();
        
//         for(int i=0; i<m; i++)
//         {
//             String p = ""+s.charAt(i);
//             if(map.containsKey(p))
//             {
//                 int val = map.get(p);
//                 map.put(p, val+1);
//             }
//             else
//             map.put(p,1);
//         }
        
//         for(int i=0; i<n; i++)
//         {
//             String temp =""+ t.charAt(i);
//             if(!map.containsKey(temp))
//                 return false;
            
//             int val= map.get(temp);
//             if(val==0)
//                 return false;
//             map.put(temp, val-1);
//         }
        
//         return true;
    }
}