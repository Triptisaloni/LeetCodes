import java.util.*;
class Solution {
    public boolean isUgly(int n) {
        
        
        if(n<1)
            return false;
        
//         int[] arr = {2,3,5};
//         int i=0;
        
//         while(n>1 && i<3)
//         {
//             if(n%arr[i]==0)
//             {
//                 while(n%arr[i]==0)
//                     n/=arr[i];
//             }
//             else
//                 i++;
//         }
        
//         return (n==1);
      
     // Brute Forcee
     while(n>1)
        {
            if(n%2==0)
                n=n/2;
            else if(n%3==0)
                n=n/3;
            else if(n%5==0)
                n=n/5;
         else
             return false;
        }
        
        return (n==1);
    }
}