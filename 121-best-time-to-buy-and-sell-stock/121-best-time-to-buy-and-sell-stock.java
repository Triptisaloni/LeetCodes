class Solution {
    
    public int maxProfit(int[] prices) {
        
        int n=prices.length;
        if(n<=1)
            return 0;
        
        int max=0;
        int cp = prices[0];
    for(int i=1; i<n;i++)
        {
            max = Math.max(max, prices[i]-cp);
            if(prices[i]<cp)
                cp= prices[i];
        }
        
        return max;
        
        
    }
}