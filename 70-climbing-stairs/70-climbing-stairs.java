class Solution {
    
    public int count(int n, int[] temp)
    {
//         Memoization
        
        if(n==0)
            return 1;
        else if(n<0)
            return 0;
        
        if(temp[n]>0)
            return temp[n];
        
        int a = count(n-1, temp);
        int b = count(n-2, temp);
        // int c = count(n-3, temp);
        
        int path = a+b;
        
        temp[n]=path;
        return path;
    }
    
    public int climbStairs(int n) 
    {
//         Memoization
        // int[] temp = new  int[n+1];
        // return count(n,temp);
        
//         Dynamic Approach
//          if(n==0)
//             return 1;
//         else if(n<0)
//             return 0;
        
//          int[] s = new int[n+1];
        
//         s[0]=1;
        
//         for(int i =1; i<=n; i++)
//         {
//             if(i==1)
// 			s[i]=s[i-1];
            
//             else 
//                 s[i]= s[i-1]+s[i-2];
//             
//         }
        
//         return s[n];
       
        if(n==0 || n==1) return 1;
        int[] nums = new int[n+1];
        nums[0] = 1;
        nums[1] = 1;
        for(int i=2; i<=n; i++) {
            nums[i] = nums[i-1] + nums[i-2];
        }
        
        return nums[n];
  
        
    }
}