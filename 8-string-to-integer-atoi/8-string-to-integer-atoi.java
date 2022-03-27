class Solution {
    public int myAtoi(String s) {
        
        if(s==null)
            return 0;
        
        s=s.trim();
        
        int n=s.length();
        
        if(n==0)
            return 0;

        int sign = 1;
        if(s.charAt(0)=='-')
            sign=-1;
        
        
        int i = (s.charAt(0)=='-' || s.charAt(0)=='+') ? 1: 0;
        long ans=0;
        int max= Integer.MAX_VALUE;
                int min= Integer.MIN_VALUE;

        while(i<s.length())
        {
            char st = s.charAt(i);
            if(st==' ' || !Character.isDigit(st)) 
                break;
        ans = ans*10 + (st-'0');
            
            if(sign==-1 && -1*ans<min)
                return min;
            if(sign==1 && ans>max)
                return max;
            i++;
        }
        
       return (int)(ans*sign);
        
    }
}