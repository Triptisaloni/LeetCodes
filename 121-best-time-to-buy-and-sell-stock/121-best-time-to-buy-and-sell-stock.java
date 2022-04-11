class Solution {
    
    public int maxProfit(int[] prices) {
        
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
//         int n=prices.length;
//         if(n<=1)
//             return 0;
        
//         int max=0;
//         int cp = prices[0];
        
//     for(int i=1; i<n;i++)
//         {
//             max = Math.max(max, prices[i]-cp);
//             if(prices[i]<cp)
//                 cp= prices[i];
//         }
        
//         return max;
        
        
    }
}