class Solution {
    public void moveZeroes(int[] nums) {
        
        int n= nums.length;
        
        if(n<=1)
            return;
        
        int[] temp = new int[n];
        int k=0;
        
        
        for(int i=0; i<n; i++)
        {
            if(nums[i]!=0)
            { temp[k]=nums[i];
                k++;
            }
        }
        
        for(int i=0;i<n; i++)
            nums[i]= temp[i];
    }
}