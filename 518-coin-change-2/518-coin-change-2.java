class Solution {
    
        public int change(int amount, int[] coins)
        {
             int n= coins.length;
             int dp[][] = new int[n+1][amount+1];
            for(int i=0; i<=n; i++)
                for(int j=0; j<=amount; j++)
                    dp[i][j]=-1;
            
            return help(amount, coins, dp, n);
        }
    
        public int help(int sum, int[] arr, int[][] dp, int n)
        {
            if(sum==0)
                return 1;
            if(n==0 || sum<0)
                return 0;
            
            // if(sum<0)
            //     return 0;
            
            if(dp[n][sum]!=-1)
                return dp[n][sum];
            
            
            if(arr[n-1]<=sum)
                dp[n][sum]=help(sum-arr[n-1], arr, dp,n) + help(sum, arr, dp,n-1);
            else
                dp[n][sum]= help(sum, arr, dp,n-1);
            
            return dp[n][sum];
        }
//     Tabulation
//     public int change(int amount, int[] coins) {
        
//         int n= coins.length;
//         int dp[][] = new int[n+1][amount+1];
        
//         for(int i=0; i<=amount; i++)
//             dp[0][i]=0;
//         for(int i=0; i<=n; i++)
//             dp[i][0] = 1;
        
//         for(int i=1; i<=n; i++)
//         {
//             for(int j=1; j<=amount; j++)
//             {
//                 if(coins[i-1]<=j)
//                     dp[i][j] = dp[i-1][j] + dp[i][j-coins[i-1]];
//                 else
//                     dp[i][j]= dp[i-1][j];
//             }
//         }
        
//         return dp[n][amount];
//     }
}