class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n = nums.length;
        
        Arrays.sort(nums);
        if(n<=1)
            return n;
        int c=1;
        int max=1;
        
        for(int i=0; i<n-1; i++)
        {
            if(nums[i]+1==nums[i+1])
            c++;
            else if(nums[i]==nums[i+1])
            {
                
            }
            else
                c=1;
            
            max= Math.max(max, c);
        }
        
        return max;
    }
}