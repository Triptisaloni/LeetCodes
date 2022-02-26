class Solution {
    public int subtractProductAndSum(int n) {
        
        int pro = 1;
        int sum=0;
        
        while(n>=1)
        {
            int rem= n%10;
            sum= sum+ rem;
            pro = pro * rem;
            n=n/10;
        }
        
        return (pro-sum);
    }
}