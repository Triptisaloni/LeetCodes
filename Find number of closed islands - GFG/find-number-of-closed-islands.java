//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] str = br.readLine().trim().split(" ");
            int N = Integer.parseInt(str[0]);
            int M = Integer.parseInt(str[1]);
            int[][] matrix = new int[N][M];
            for(int i=0; i<N; i++)
            {
                String[] s = br.readLine().trim().split(" ");
                for(int j=0; j<M; j++)
                    matrix[i][j] = Integer.parseInt(s[j]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.closedIslands(matrix, N, M));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public void dfs(int[][] matrix, int i, int j, int N, int M)
    {
        if(i>=0 && j>=0 && i<N && j<M && matrix[i][j]==1)
       { 
        matrix[i][j]=0;
        
         dfs(matrix, i+1, j, N, M);
         dfs(matrix, i-1, j, N, M);
         dfs(matrix, i, j+1, N, M);
         dfs(matrix, i, j-1, N, M);
            }
    }
    
    public int closedIslands(int[][] matrix, int N, int M)
    {
       for(int i=0; i<N; i++)
       { for(int j =0; j<M; j++)
           {
               if((i==0 || j==0 || i==N-1 || j==M-1) &&(matrix[i][j]==1))
               {
                  dfs(matrix, i, j, N, M);
               }
           }
       }
       
       int count =0;
       
       for(int i=1; i<N-1; i++)
       { for(int j =1; j<M-1; j++)
           {
               if(matrix[i][j]==1)
               {
                  dfs(matrix, i, j, N, M);
                  count++;
               }
           }
       }
       
       return count;
    }
}