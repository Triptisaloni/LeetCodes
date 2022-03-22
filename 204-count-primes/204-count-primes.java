class Solution {
    
    public boolean isprime(int num)
    {
        if(num<=1)
            return false;
        
            for(int i=2; i*i<=num; i++ )
                if(num%i==0)
                    return false;
                    
        return true;
    }
    
    public int countPrimes(int n) 
    {
       
        boolean [] p = new boolean[n];
        int c=0;
        
        for(int i=2; i<n; i++)
            p[i]= true;
        
        
          for (int i = 2; i * i < n; i++)
    {
             if (!p[i]) 
          continue;
              
        for (int j = i * i;  j < n; j += i) 
                p[j] = false;
            
   }
        
        for(int i=2; i<n; i++)
            if(p[i]==true)
                c++;
                
        
        return c;
    }
}