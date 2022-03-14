class Solution {
    public double findMaxAverage(int[] nums, int k) {
        

        if(nums.length==1)
            return nums[0];
        
        double maxavg=0, win=0;
        
        for(int i=0;i<k; i++)
        {
            win+=nums[i];
        }
        
maxavg=win;
        
        for(int j=k; j<nums.length; j++)
        {
            win+=nums[j]- nums[j-k];
            maxavg = Math.max(win, maxavg);
            
        }
        
        return maxavg/k;
    }
}