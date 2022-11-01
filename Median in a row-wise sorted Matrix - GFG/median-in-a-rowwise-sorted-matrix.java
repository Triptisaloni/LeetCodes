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
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                String line[]=read.readLine().trim().split(" ");
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[j]);
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
    int median(int matrix[][], int R, int C) {
        
        int n = R*C;
        
        int min = 2001, max = 0;
        
        for(int i=0; i<R; i++)
        {
            if(matrix[i][0]<min)
            min = matrix[i][0];
            
            max = Math.max(max, matrix[i][C-1]);
        }
        
        while(min<=max)
        {
            int mid = (min+max)/2, count =0;
            
            for(int i=0; i<R; i++)
            {
                int l =0, h = C-1;
                
                while(l<=h)
                {
                    int half = (l+h)/2;
                    
                    if(matrix[i][half]<=mid)
                    l = half+1;
                    else
                    h = half-1;
                    
                }
                
                count+=l;
            }
            
            if(count<=n/2)
            min = mid+1;
            else
            max = mid-1;
        }
        
        return min;
    }
}