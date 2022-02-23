class Solution {
    public boolean isPowerOfFour(int n) {
         long x=1;
    while(x<n)
        x=x*4;
    return x==n;

    }
}