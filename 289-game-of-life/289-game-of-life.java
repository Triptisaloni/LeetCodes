class Solution {
    public void gameOfLife(int[][] board) {
        
            int t[][]=new int[board.length][board[0].length];
        
    int m=t.length,n=t[0].length;
    for(int i=0;i<t.length;i++)
    {
        for(int j=0;j<t[0].length;j++)
        {
            int c=0;
            if(i-1>=0 && j-1>=0 && board[i-1][j-1]==1)
            {
                c++;
            }
            if(i-1>=0 && board[i-1][j]==1)
                c++;
            if(i-1>=0 && j+1<n && board[i-1][j+1]==1)
                c++;
            if(j+1<n && board[i][j+1]==1)
                c++;
            if(i+1<m && j+1<n && board[i+1][j+1]==1)
                c++;
            if(i+1<m && board[i+1][j]==1)
                c++;
            if(i+1<m && j-1>=0 && board[i+1][j-1]==1)
                c++;
            if(j-1>=0 && board[i][j-1]==1)
                c++;
            if(board[i][j]==0)
            {
                  if(c==3)
                      t[i][j]=1;
                else
                    t[i][j]=0;
            }
            else 
            {
                if(c<2 || c>3)
                    t[i][j]=0;
                else 
                    t[i][j]=1;
            }
        }
    }
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
            board[i][j]=t[i][j];
    }
    }
}