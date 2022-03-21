class Solution {
    public int search(int[] nums, int target) 
    {
        int n =nums.length;
        
        // if (nums.length==1 && target==nums[0])
        //     return 0;
        // else
        //     return -1;
        
        if(nums[0]==target)
            return 0;
        
        
        if(nums[0] < target)
        {
            int i=0;
            
            while(i!=n && nums[i]<=target)
            {
                if(nums[i]==target)
                    return i;
                i++;
            }
            return -1;
        }
        else
        {
             int i=n-1;
            
            while(i>=0 && nums[i]>=target)
            {
                if(nums[i]==target)
                    return i;
                i--;
            }
            return -1;
            
        }
            
    }
}