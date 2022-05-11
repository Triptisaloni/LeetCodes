class Solution {
    
    int a =1, e=1,i=1,o=1,u=1;
    
    public int countVowelStrings(int n) {
        
        for(int p=1; p<n; p++)
            inc();
        
        
        return a+e+i+o+u;
    }
    
    
    public void inc()
    {
        a =a+e+i+o+u;
        e = e+i+o+u;
        i= i+o+u;
        o=o+u;
        // u=u;
    }
}