class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int n = nums.length;
        int [] res = new int[2];
        res[0]=-1;
        res[1]=-1;
        
        if(n==0)
            return res;
        int l=0, r=n-1;
        int mid =0;
        
        while(l<=r)
        {
            mid = l+(r-l)/2;
            
            if(nums[mid]==target)
            {
                int first = mid;
                while(first>=0 && nums[first]==target)
                     first--;
                res[0]= first+1;
                int last = mid;
                while(last<n && nums[last]==target)
                     last++;
                res[1]= last-1;
                
                return res;
                
        
                
            }
            else if(target<nums[mid])
                r=mid-1;
            else
                l=mid+1;
        }
        
      
        return res;
    }
}