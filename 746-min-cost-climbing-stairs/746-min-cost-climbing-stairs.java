class Solution {
    
    public int help(int[] cost, int index, int[] dp)
    {
                int n = cost.length;

        if(index>=n)
            return 0;
        if(dp[index]!=-1)
            return dp[index];
        
        dp[index]= Math.min(cost[index]+help(cost, index+1, dp), cost[index]+help(cost, index+2, dp));
        
        return dp[index];
    }
    
    
    public int minCostClimbingStairs(int[] cost) {
        
        int n = cost.length;
int dp[] = new int[n+1];
        
        Arrays.fill(dp, -1);
        return Math.min(help(cost, 0, dp), help(cost, 1, dp));
    }
}