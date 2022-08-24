class Solution {
    
    public int help(String a, String b, int n, int m,int[][]dp)
    {
        if(n==0 || m==0)
        {
            dp[n][m]=0;
            return dp[n][m];
        }
        
        if(dp[n][m]!=-1)
        return dp[n][m];
        
        if(a.charAt(n-1)==b.charAt(m-1))
        dp[n][m] = help(a,b,n-1, m-1,dp) + 1;
        else
        dp[n][m] = Math.max(help(a, b, n, m-1,dp) , help(a, b, n-1, m,dp));
        
        
        return dp[n][m];
    }
    public int longestCommonSubsequence(String text1, String text2) 
    {
        int n = text1.length();
        int m = text2.length();
        
        int dp[][] = new int[n+1][m+1];
        
        for(int i=0; i<=n; i++)
        for(int j=0; j<=m; j++)
           dp[i][j]=-1;
        
        return help(text1, text2, n, m, dp);
    }
}