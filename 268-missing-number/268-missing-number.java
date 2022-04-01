class Solution {
    public int missingNumber(int[] nums) {
        
        int  n= nums.length;
        
        if(n==0)
            return 0;
//         
        // Arrays.sort(nums);
        
//         if(nums[n-1]==n-1)
//             return n;
        
        int xor=0;
        
        for(int i=0; i<n; i++)
        {
            xor^= nums[i];
        }
        for(int i=0; i<=n; i++)
        {
            xor^=i;
        }
        
        
            return xor;
    }
}