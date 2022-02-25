class Solution {
    
    public int count(int n, int[] temp)
    {
        if(n==0)
            return 1;
        else if(n<0)
            return 0;
        
        if(temp[n]>0)
            return temp[n];
        
        int a = count(n-1, temp);
        int b = count(n-2, temp);
        // int c = count(n-3, temp);
        
        int path = a+b;
        
        temp[n]=path;
        return path;
    }
    
    public int climbStairs(int n) 
    {
        
        int[] temp = new  int[n+1];
        return count(n,temp);
        
    }
}