class Solution {
    public int countOdds(int low, int high) {
        
//         int odd=0;
        
//         for(int i =low; i<=high; i++)
//         {
//             if(i%2==1)
//             odd++;
//         }
        
//         return odd;
        
        int step = high-low+1;
        
        if(step%2==0)
            return step/2;
        
        if(low%2==0)
            return(step-1)/2;
        else
            return(step+1)/2;
        
        // return 0;
    }
}