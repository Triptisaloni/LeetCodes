class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        
        
        if(n<=1)
            return 0;
        
        int l = prices[0],diff=0;
            
        for(int i=1; i<n; i++)
        {
            if(prices[i]<l)
                l= prices[i];
            else
            {
                if(prices[i]-l >= diff)
                    diff  = prices[i]-l;
            }
                
        }
        return diff;
        
    }
}