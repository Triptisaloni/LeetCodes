//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            String W = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.numberOfSubsequences(S,W));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int numberOfSubsequences(String S, String W){
        // code here
        int len1 = S.length();
       int len2 = W.length();

       int i = 0,j=0, ans=0;
   StringBuilder sb = new StringBuilder(S);

       while(i < len1 && j < len2)
       {
           if(sb.charAt(i) == W.charAt(j))
           {
               sb.setCharAt(i,'#');
               i++;
               j++;
           }
           else{
               i++;
           }

           if(j == len2)
           { ans++;
               i=0;
               j=0;
           }

       }

       return ans;
        
        
    }
}