class Solution {
    public int reverse(int x) {
        
        if(x%10==x)
            return x;
       
        
        
        long rev=0;
//         // int flag=0;
        
//         if(x<0)
//         {
//             flag =-1;
//             x=Math.abs(x);
//         }
        long y=x;
        
        while(y != 0)
        {
            
            rev= rev*10 + y%10;
             if(rev<=-2147483646 || rev>=2147483647)
            return 0;
         if(y<=-2147483646 || y>=2147483647)
            return 0;
            y=y/10;
        }
        
//         if(flag==-1)
//             rev=rev*(-1);
        
       
        return (int)rev;
    }
}