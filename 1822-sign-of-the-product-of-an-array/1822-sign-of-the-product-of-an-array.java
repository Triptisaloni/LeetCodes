class Solution {
    public int arraySign(int[] nums) {
        
        int pro =1;
        int neg=0;
        int pos=0;
        
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]<0)
                neg++;
            else if(nums[i]>0)
                pos++;
            else
                return 0;
            
            
        }
        
        if(neg%2==0)
            return 1;
        else 
            return -1;
    }
}