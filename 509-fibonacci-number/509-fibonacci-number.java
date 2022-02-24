class Solution {
    
    public int fibbo(int n, int[] storage)
    {
        if(n==0||n==1)
        {
            storage[n]=n;
            return n;
        }
        
        if(storage[n]!=-1)
            return storage[n];
        
        storage[n]= fibbo(n-1,storage)+ fibbo(n-2, storage);
        
        return storage[n];
    }
    public int fib(int n) {
        
//         DP approach
        int memory[] = new int[n+1];
        
        for(int i=0; i<=n; i++)
        memory[i] = -1;
        
       return fibbo(n,memory);
//         Normal 
//         if(n==0 || n==1)
//             return n;
        
//         return (fib(n-1) + fib(n-2));
        
    }
}