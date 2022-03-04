import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> s =new HashSet<>();
        
        while(true)
        {
            int sum=0;
            while(n>0)
            {
                sum+= (n%10)*(n%10);
                n=n/10;
            }
            
            n=sum;
            
            if(sum==1)
                return true;
            
            if(s.contains(sum))
                return false;
            
            else
                s.add(sum);
        }
    }
}