class Solution {
    public int pivotIndex(int[] nums) {
          
        int prefixSum =0;
        
        for(int i: nums)
            prefixSum+=i;
        
        int l = 0, r = prefixSum; 
        for(int i=0; i<nums.length; i++)
        {
            r-=nums[i];
            if(i!=0)
                l+=nums[i-1];
            
            if(l==r)
                return i;
        }
        
        return -1;
    }
}