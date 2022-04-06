class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        
        if(n<3)
            return res;
        
        Arrays.sort(nums);
        
        
        for(int i=0; i<n-2; i++)
        {
            if(nums[i]>0)
                break;
            
            if( (i==0  ) || (i >0 && nums[i]>nums[i-1]))
                
            {int l=i+1, r=n-1;
            
            while(l<r)
            {
                if(nums[i]+nums[l]+nums[r]==0)
                { 
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    
                    while(l<r && nums[l]==nums[l+1])
                        l++;
                     while(l<r && nums[r]==nums[r-1])
                        r--;
                    l++;
                    r--;
                 
                 }
                
                else if(nums[i]+nums[l]+nums[r]<0)
                    l++;
                else
                    r--;
            }
             
            }
        }
        
        return res;
    }
}