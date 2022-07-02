class Solution {
/*    Normal approach
    public int fib(int n) {
        
        if(n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }*/
    
    public int fib(int n)
    {
        int [] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return help(n, dp);
        
    }
    
    public int help(int n, int[] storage)
    {
        if(n<=1)
        {
            storage[n]=n;
            return n;
        }
        
        if(storage[n]!=-1)
            return storage[n];
        
        return help(n-1,storage )+help(n-2, storage);
    }
}