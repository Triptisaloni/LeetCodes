class Solution {
    public int arrangeCoins(int n) {
        
        int count =0;
        int i=1;
        
        while(n-i >=i+1)
        {
            n= n-i;
            i++;
        }
        
        return i;
        
    }
}