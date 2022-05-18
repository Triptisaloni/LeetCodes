class Solution {
    
    public void swap(int[] nums, int a, int b)
    {
        int temp=nums[a];
        nums[a]= nums[b];
        nums[b]=temp;
    }
    
    public int removeElement(int[] nums, int val) 
    {
        
        int n = nums.length;
        // int count =n;
        
        for(int i =0; i<n; i++)
        {
           if(nums[i]==val)
           {
               while(i<n)
               {
                   if(nums[n-1]!=val)
                   {
                       int temp=nums[i];
        nums[i]= nums[n-1];
        nums[n-1]=temp;
                       n--;
                       break;
                   }
                   
                   else
                        n--;
               }
           }
            
            
        }
        
        return n;
    }
}