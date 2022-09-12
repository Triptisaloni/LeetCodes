class Solution {
    public int maxProfit(int[] prices) {
        
        int profitMax = 0;
        
        int buyLowest= Integer.MAX_VALUE;
        
        for(int i : prices)
        {
            buyLowest = Math.min(buyLowest, i);
            
            profitMax = Math.max(profitMax, i - buyLowest);
        }
     
        return profitMax;
    }
}