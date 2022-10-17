//{ Driver Code Starts
//Initial Template for Java

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
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            String line[] = read.readLine().trim().split("\\s+");
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[c++]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int median(int matrix[][], int r, int c) 
    {
    //      if(c==1)
    //      return matrix[r/2][0];
         
    //      if(r==1)
    //      return matrix[0][c/2];
         
        int n = r*c ;
        
        int min = 2000, max = 1;
        for(int i=0; i<r; i++)
        {
            if(matrix[i][0]<min)
            min = matrix[i][0];
            
            if(matrix[i][c-1]>max)
            max = matrix[i][c-1];
        }
        
        int mid;
        
        while(min<=max)
        {
            mid = (min+max)/2;
            int ans=0;
            
            for(int i=0; i<r; i++)
            {
                int l =0, h= c-1;
                
                //binary search
                while(l<=h)
                {
                    int aadha = (l+h)/2;
                    if(matrix[i][aadha] <=mid)
                     l = aadha+1;
                    else
                      h= aadha-1;
                }
                
                ans+=l;
            }
            
            if(ans<=n/2)
            min = mid+1;
            else
            max = mid-1;
            
        }
        
        return min;
    }
}