class Pair{
    int r, c, path;
    
    Pair(int x, int y, int z)
    {
        r=x; c=y; path=z;
    }
}

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) 
    {
        
        int n = grid.length;
        boolean [][] vis = new boolean[n][n];
        if(grid[0][0] != 0 )
            return -1;
        
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(0,0, 1));
      vis[0][0]=true;
        
        while(!q.isEmpty())
        {
            int r = q.peek().r;
            int c = q.peek().c;
            int path = q.peek().path;
            q.poll();
            
            if(r==n-1 && c==n-1)
                return path;
            
            for(int i=-1; i<=1; i++)
                for(int j=-1; j<=1; j++)
                {
                    if(i==0 && j==0)
                        continue;
                    
                    int x = r+i, y = c+j;
                    
                    if(x>=0 && x<n && y>=0 && y<n && !vis[x][y] && grid[x][y]==0)
                    {
                        vis[x][y]=true;
                        q.offer(new Pair(x,y,path+1));
                    }
                }
            
        }
        
        return -1;
    }       
//         int i =0, j=0;
                
//                 if(!vis[i][j] && grid[i][j]==0)
//                    { 
//                     int p = 1+dfs(grid, vis, i, j, m, n);
//                     if(vis[m-1][n-1] == true)
//                         return p;
//                    }
        
        
//         return -1;
    
    
    public int dfs(int[][] grid, boolean[][] vis, int r, int c, int m, int n)
    {
        
        vis[r][c] = true;
        
        for(int i=-1; i<=1; i++ )
        {
            for(int j = -1; j<=1; j++)
            {
                int x = r+i, y = c+j;
                
                if(x>=0 && x<m && y>=0 && y<n && !vis[x][y] && grid[x][y]==0)
                {
                 int p = 1+dfs(grid, vis, x, y, m, n);
                    if(vis[m-1][n-1] == true)
                        return p; 
                }
            }
        }
        
        return 0;
        
        
    }
}