import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n = nums.length;
        int[] res = new int[n];
        int i=0, j=n-1, k=j;
        
        if(nums.length==0)
            return nums;
        
       while(i<=j)
       {
           int a = nums[i]*nums[i];
           int b = nums[j]*nums[j];
           
           if(a>b)
           {
               res[k]= a;
               i++;
               
           }
           
           else
           {
               res[k]= b;
               j--;
           }
           
           k--;
       }
        
        return res;
    }
}