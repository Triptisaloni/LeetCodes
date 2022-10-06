class Solution {
    public int numIslands(char[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;
        
        boolean  vis[][] = new boolean [n][m];
        int ans = 0, temp=0;
        
        for(int i=0; i<n ; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(grid[i][j]=='1' && !vis[i][j])
                {
                    vis[i][j] = true;
                    dfs(grid, vis, i, j, n, m);
                    ans++;
                } 
            }
        }
        
        return ans;
    }
    
    public void dfs(char[][] grid, boolean [][] vis, int r, int c, int n, int m)
    {
        
        // 
        
        int delRow[] = new int[]{-1,0,1,0};
        int delCol[] = new int[]{0,1,0,-1};
        // int count =0;
        
        for(int i=0; i<4; i++)
        {
            int x = r+delRow[i];
            int y = c+delCol[i];
            
            if(x>=0 && x<n && y>=0 && y<m && !vis[x][y] && grid[x][y]=='1')
            {
                vis[x][y]= true;
                dfs(grid, vis, x, y, n, m);
            }
        }
        
        // return 1+count;
        
    }
}