class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        
        if(nums.length<3)
            return 0;
        // int prev =0,slices=0;
        int[] dp = new int[nums.length];
        
        int ans=0;
        
        for(int i=2;i<nums.length; i++)
        {
            if(nums[i]-nums[i-1]== nums[i-1]-nums[i-2])
            {
                dp[i]= 1+dp[i-1];
                ans+=dp[i];
            }
            // else
            //     prev=0;
                
        }
        return ans;
    }
}