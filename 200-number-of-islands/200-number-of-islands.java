class Solution {
    public int numIslands(char[][] grid) 
    {
        int row= grid.length, col= grid[0].length;
        boolean [][] done = new boolean[row][col];
        int count =0;
        
        for(int i=0; i<row; i++)
        for(int j=0; j<col; j++)
        {
            if(!done[i][j] && grid[i][j]!='0')
            {
                help(grid, done, i, j, row, col);
                    count++;
            }
        }
        return count;
}
        
        
        public void help(char[][] grid, boolean[][] done, int i, int j, int row, int col )
        {
            if(i<0 || j<0 || i>=row ||j>=col)
                return;
            if(done[i][j]==true)
                return;
            if(grid[i][j]=='0')
                return;
            
            done[i][j]=true;
            
            help(grid, done, i+1, j, row, col);
            help(grid, done, i, j+1, row, col);
            help(grid, done, i-1, j, row, col);
            help(grid, done, i, j-1, row, col);
        }
        
        
//     {
        
//         boolean [][] visited=new boolean[grid.length][grid[0].length];
//         int c=0;
        
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[i].length;j++)
//             {
//                 if(visited[i][j]!=true && grid[i][j]!='0')
//                 {
//                     helper(grid,i,j,visited);
//                     c++;
//                 }
//             }
//         }
        
//         return c;
//     }
    
    
//     private void helper(char[][] matrix,int i,int j,boolean[][]visited){
//         if(i<0) return;
//         if(j<0)  return;
        
//         if(i==matrix.length) return;
//         if(j==matrix[i].length) return;
        
//         if(visited[i][j]==true) return;
//         if(matrix[i][j]=='0') return;
        
//         visited[i][j]=true;
//         helper(matrix,i,j+1,visited);
//         helper(matrix,i,j-1,visited);
//         helper(matrix,i-1,j,visited);
//         helper(matrix,i+1,j,visited);
//     }
}