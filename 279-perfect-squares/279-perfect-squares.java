class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        
        for(int i=1; i<=n;i++){
            int k=1;
            int min = Integer.MAX_VALUE;
            //keep on substracting squares of numbers from current number
            //until the square is bigger than the number
            while (k*k <= i){
            //eg dp[13] = Min (dp[13- 1*1], dp[13- 2*2], dp[13- 3*3], )
                min = Math.min (dp[i-(k*k)]+1 , min);
                k++;
            }
            dp[i]=min;
        }
        return dp[n];
    }
}