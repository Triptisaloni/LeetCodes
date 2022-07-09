// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.sequence(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    // static long help(int n, int count)
    // {
    //     if(count ==n+1)
    //     return 0;
        
        
        
    // }
    
    static long sequence(int N){
        
        // help(N, 1);
        int num=1;
        long sum=0;
        
        for(int i=1; i<=N; i++)
        {
            long pro=1;
            for(int j=1; j<=i; j++)
            {
                pro = pro*num;
                num++;
            }
            
            sum+=pro;
        }
        
        return sum;
    }
}