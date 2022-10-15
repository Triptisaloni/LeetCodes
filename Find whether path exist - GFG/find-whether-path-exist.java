//{ Driver Code Starts
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
            int n = Integer.parseInt(br.readLine().trim());
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            boolean ans = obj.is_Possible(grid);
            if(ans)
                System.out.println("1");
            else 
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


class Pair
{
    int r, c;
    Pair(int a, int b)
    {
        r=a; c=b;
    }
}
class Solution
{
    //Function to find whether a path exists from the source to destination.
    public boolean is_Possible(int[][] grid)
    {
        int n= grid.length, a1=0,a2=0, b1,b2;
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(grid[i][j] ==1)
                {
                    a1=i;a2=j;
                }
                if(grid[i][j]==2)
                {
                    b1=i; b2 = j;
                }
            }
        }
        
        Queue<Pair> q = new LinkedList<>();
        boolean vis[][] = new boolean[n][n];
        vis[a1][a2]=true;
        q.offer(new Pair(a1, a2));
        
        int row[] = {0,1,0,-1};
        int col[] = {1,0,-1,0};
        
        while(!q.isEmpty())
        {
            int r = q.peek().r;
            int c= q.peek().c;
            q.poll();
            
            for(int i=0; i<4; i++)
            {
                int x = r+row[i], y = c+col[i];
                
                if(x>=0 && x<n && y>=0 && y<n && !vis[x][y])
                {
                    if(grid[x][y]==2)
                    return true;
                    
                    if(grid[x][y]==3)
                    {
                        vis[x][y]= true;
                        q.offer(new Pair(x,y));
                    }
                }
            }
            
        }
        
        
      return false;  
    }
}