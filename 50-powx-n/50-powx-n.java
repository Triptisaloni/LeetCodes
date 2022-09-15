class Solution {
    public double myPow(double x, int n) 
    {
       long copyOfPower = n;
        double result = 1.0;
        
        if(copyOfPower < 0)
            copyOfPower *= -1;
        
 
        while(copyOfPower > 0)
        {
            if(copyOfPower %2 == 1)
            {
                result *= x;
                copyOfPower -= 1;
            }
            else
            {
                x *= x;
                copyOfPower /= 2;
            }
        }
        
        
        // If Power Is Negative We Change The result to 1/result
        if(n < 0){
            result = (double)(1.0/result);
        }
        
        // Returning The Result
        return result;
    }
}