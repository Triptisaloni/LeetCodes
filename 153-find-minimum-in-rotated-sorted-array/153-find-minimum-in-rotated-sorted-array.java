class Solution {
    public int findMin(int[] nums) {
        
        int n= nums.length;
        if(n==1)
            return nums[0];
        
        if(nums[0]< nums[n-1])
            return nums[0];
        
        for(int i=1; i<n; i++)
        {
            if(nums[i]<nums[i-1])
                return nums[i];
        }
        
        return -1;
    }
}