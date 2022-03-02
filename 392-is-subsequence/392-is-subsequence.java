class Solution {
    public static int sub(String s, String t)
    {
        int m= s.length();
        int n = t.length();
        
//            if(m==0||n==0)
//             return 0;
        
        int storage[][]=new int[m+1][n+1];
        
//         for(int i=0; i<=m; i++)
//             storage[i][0]=0;
        
//           for(int i=0; i<=n; i++)
//             storage[0][i]=0;
        
        
        for(int i=1;i<=m;i++)
        {
            for(int j=1; j<=n; j++)
            {
             if(s.charAt(m-i)==t.charAt(n-j))
                    storage[i][j]= 1+storage[i-1][j-1];
        else
        {
            storage[i][j]= Math.max(storage[i-1][j], storage[i][j-1]);
        }
            }
        }
        return storage[m][n];
    }
    
    public boolean isSubsequence(String s, String t) 
    {
        int res = sub(s,t);
        if(res==s.length())
            return true;
        else
            return false;
     
    }
}