class Solution {
    public int addDigits(int num) {
        
        if(num%10==num)
            return num;
        
        int rem=0;
        int sum =0;
        while(num>=1)
        {
            rem= num%10;
            sum+=rem;
            num=num/10;
        }
        
        return addDigits(sum);
    }
}