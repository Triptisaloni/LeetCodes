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
            List<Integer> ans = new ArrayList<Integer>();
            StringBuilder out = new StringBuilder();
            ans = ob.jugglerSequence(N);
            for(int i = 0;i < ans.size();i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    
    public static void help(ArrayList<Integer> l, int n)
    {
        l.add(n);
        
        if(n==1)
        return;
        
        if(n%2==0)
            n=(int)Math.pow(n, 0.5);
        else
            n= (int)Math.pow(n, 1.5);
            
            help(l, n);
        
    }
    
    static List<Integer> jugglerSequence(int N){
        
        ArrayList<Integer> l = new ArrayList<>();
        help(l, N);
        
        return l;
    }
}