class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) 
    {
        int sum =0;
        for(int i: nums)
        {
            if(i%2==0)
                sum+=i;
        }
        
        int n=queries.length;
        
        int ans[] = new int[n];
        
        for(int i=0; i<n; i++)
        {
            int ind = queries[i][1];
            int val= queries[i][0];
            
            int prev = nums[ind];
            if(prev%2==0)
                sum-=prev;
            
            nums[ind]+= val;
            
            if(nums[ind]%2==0)
                sum+=nums[ind];
            
            ans[i] = sum;
            
        }
        
        return ans;
    }
}