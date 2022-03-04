import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n= nums.length;
         ArrayList<Integer> list = new ArrayList<>();
        
        if(n==0)
            return null;
//         if(n<3)
//         {
//             for(int i: nums)
//                 list.add(i);
//             return list;
                
//         }
            
       int req= n/3;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i: nums)
        {
            if(map.containsKey(i))
            {
                int val = map.get(i);
                map.put(i, val+1);
            }
            else
                map.put(i,1);
        }
        
        for(int i: map.keySet())
        {
            if(map.get(i)>req)
                list.add(i);
        }
        
        return list;
    }
}