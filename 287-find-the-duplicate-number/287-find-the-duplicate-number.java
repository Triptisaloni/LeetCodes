import java.util.*;

class Solution {
    public int findDuplicate(int[] nums) 
    {
        int n= nums.length;
        HashSet<Integer> map = new HashSet<>();
        
         for(int i : nums)
         {
             if(map.contains(i))
                 return i;
             else
                 map.add(i);
         }
        
        
        return -1;
    }
}