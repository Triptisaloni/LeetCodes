class Solution {
    public void sortColors(int[] nums) {
       
        int z=0, o=0, t=0;
        
        for(int i : nums)
        {
            if(i==0)
                z++;
            if(i==1)
                o++;
            if(i==2)
                t++;
        }
        
        int i=0;
        while(i<nums.length)
        {
            while(z>0)
            {
                nums[i] =0;
                z--;
                i++;
            }
            while(o>0)
            {
                nums[i] =1;
                o--;
                i++;
            }
            while(t>0)
            {
                nums[i] =2;
                t--;
                i++;
            }
        }
    }
}