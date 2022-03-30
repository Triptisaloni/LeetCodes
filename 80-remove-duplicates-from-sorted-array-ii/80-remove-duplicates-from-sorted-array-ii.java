class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n=nums.length;
        int[] arr= new int[n];
        arr[0] = nums[0];
        
        int prev= nums[0],count =1;
        int j=1;
        
        for(int i=1; i<n; i++)
        {
            if(nums[i] ==prev)
            {
                if(count <2)
                {count++;
                 arr[j]= prev;
                 j++;
                }
            }
            else
            {
                count =1;
                prev = nums[i];
                arr[j]= prev;
                j++;
            }
            
        }
        
        for(int i=0; i<n; i++)
        nums[i] = arr[i];
        
        return j;
    }
}