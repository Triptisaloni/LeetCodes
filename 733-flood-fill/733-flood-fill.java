class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int original = image[sr][sc];
        if(color == original)
            return image;
        
        // boolean vis[]
        
        dfs(image, sr, sc, color, original);
            return image;
            
    }
    
    public void dfs(int[][] image, int x, int y, int color, int original)
    {
        int n  = image.length;
        int m = image[0].length;
        
        if(x<0 || y<0 || x>=n || y>=m || image[x][y] == color|| image[x][y]!=original)
            return;
        
        
        image[x][y] = color;
        
        int [] r = new int[]{0,1,0,-1};
        int [] c  = new int[]{1,0,-1,0};
        
        for(int i=0; i<4; i++)
       { 
            int p = x+r[i];
            int q = y+c[i];
            
            if(p<n && p>=0 && q >=0 && q<m)
            {
                if(image[p][q]==original )
                     dfs(image, p,q ,color,original);
            }
        
        
        }
        
        
        // dfs(image, x , y+1 ,color,original);
        // dfs(image, x-1 , y ,color,original);
        // dfs(image, x , y-1 ,color,original);
    }
}