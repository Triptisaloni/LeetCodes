import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) 
    {
        int n = nums.length;
        
        if(n==0)
            return 0;
        
        Arrays.sort(nums);
        
        return nums[n/2];
//         int count =1;
//         int max =1;
//         int prev = nums[0];
        
//         for(int i=1; i<nums.length; i++ )
//         {
//             if(nums[i]==prev)
//                 count++;
//             else
//             {
//                 if(max<count)
//                     max=count;
                
//                 // max = count;
                
//                 count=1;
//                 prev = nums[i];
//             }
            
//         }
        
//         if(max > n/2)
//         return prev;
//         else
//             return -1;
        
    }
}