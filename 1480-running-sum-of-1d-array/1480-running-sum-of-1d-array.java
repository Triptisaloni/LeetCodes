class Solution {
    public int[] runningSum(int[] nums) {
        
        int n= nums.length;
        
        if(n<=1)
            return nums;
        
        int[] res = new int[n];
        
        int sum=0;
        
        for(int i=0; i<n; i++)
        {
            sum+=nums[i];
            
            res[i]= sum;
        }
        
        return res;
    }
    
}