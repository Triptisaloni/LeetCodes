class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        
        int n= nums.length;
        if(n<=1)
            return nums;
        
        int[] ans = new int[n];
        
        int j=0, k=n-1;
        
        for(int i=0; i<n; i++)
        {
            if(nums[i]%2==0)
            {
                ans[j]= nums[i];
                j++;
            }
            else
            {
                ans[k]=nums[i];
                k--;
            }
        }
        
        return ans;
    }
}