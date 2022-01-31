class Solution {
    public int findFinalValue(int[] nums, int original) {
        
      
       while(true) 
       { 
           int p = original;
           
           for(int i=0; i<nums.length; i++)
        {
            if(original == nums[i])
            {original*= 2;
             break;}
        }
           if(p==original)
               break;
       }
        
        return original;
    }
}