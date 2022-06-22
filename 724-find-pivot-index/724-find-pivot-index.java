class Solution {
    public int pivotIndex(int[] nums) {
        
        // int i=0;
        int n = nums.length;
        
        int sumR=0;
        
        for(int i=0; i<n; i++)
        {
            sumR+=nums[i];
        }
        
        int sumL=0;
        
        for(int i=0; i<n; i++)
        {
            if(i!=0)
                sumL= sumL+nums[i-1];
            sumR= sumR-nums[i];
            
            if(sumL==sumR)
                return i;
        }
        
        return -1;
        
        
        
    }
}