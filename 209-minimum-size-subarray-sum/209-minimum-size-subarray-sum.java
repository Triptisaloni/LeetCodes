class Solution {
    public int minSubArrayLen(int target, int[] nums)
    {
        
        int start=0,end=0,n = nums.length,sum=0;
        int count=0;
        int min=Integer.MAX_VALUE;
        int flag=0;
        
        while(start<=end && end<n)
        {
            // sum = sum+nums[end];
        
            if(sum+nums[end]<target)
            {
                sum+=nums[end];
                end++;
            }
            else if(sum + nums[end]>=target)

            {
                flag=1;
                count = end-start+1;
                min = Math.min(count, min);
               sum-=nums[start];
                start++;
            }
            
            
        }
        
        
        if(flag==0)
            return 0;
        
        return min;
        
        
    }
} 