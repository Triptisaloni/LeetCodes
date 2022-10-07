class Pair
{
    int first, second;
    Pair(int f, int s)
    {
        first = f; second = s;
    }
}

class Solution {
    public int numEnclaves(int[][] grid) {
        
        int n = grid.length , m  = grid[0].length;
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if((i==0 || j==0 || i==n-1 || j==m-1) && grid[i][j]==1)
                {
                    grid[i][j] = 2; 
                   int waste =  bfs(grid, i, j, n, m);
                }
            }
        }
        
        int ans=0;
        
         for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(grid[i][j]==1)
                {
                    grid[i][j] = 2; 
                    // ans++;
                 ans+=   bfs(grid, i, j, n, m);
                }
            }
        }
        
        return ans;
    }
    
    
    public int bfs(int[][] grid, int x, int y, int n, int m)
    {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(x,y));
        
        int delRow[] = new int[]{0,-1,0,1};
        int delCol[] = new int[]{-1,0,1,0};
        int count=0;
        
        while(!q.isEmpty())
        {
            int r = q.peek().first;
            int c = q.peek().second;
            q.poll();
            count++;
            for(int i=0; i<4; i++)
            {
                int row = r+delRow[i];
                int col = c+delCol[i];
                
                if(row<n && row>=0 && col>=0 && col<m)
                {
                    if(grid[row][col]==1)
                    {
                        grid[row][col]=2;
                        q.offer(new Pair(row, col));
                    }
                }
            }
        }
        
        return count;
        
    }
}