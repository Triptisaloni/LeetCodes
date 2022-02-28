class Solution {
    
     public int minPathSum(int[][] grid) { 
     int m = grid.length ;
        int n= grid[0].length;
        int[][] space = new int[m][n];
          
          space[m-1][n-1]=grid[m-1][n-1];
          
        	for(int j=n-2; j>=0; j--)
                space[m-1][j]= space[m-1][j+1] + grid[m-1][j];
          for(int i=m-2; i>=0; i--)
                space[i][n-1]= space[i+1][n-1] + grid[i][n-1];
          
          for(int i=m-2; i>=0;i--)
          {
              for(int j=n-2; j>=0;j--)
              {
                  space[i][j]= grid[i][j]+ (Math.min(space[i][j+1],space[i+1][j])); 
              }
          }
          
          return space[0][0];
    
     }
    
//        public static int travel(int[][]arr, int[][] space, int i, int j,int a, int b)
//     {
//         if(i==a && j==b)
//         {
//             space[i][j]=arr[i][j];
//             return space[i][j];
//         }
        
//         int op1=Integer.MAX_VALUE ,op2=Integer.MAX_VALUE ;
        
//         if(j!=b)
//         op1= travel(arr,space, i,j+1, a,b);
//         // if(j!=b&&i!=a)
//         //  op2= travel(arr,space, i+1,j+1, a,b);
//         if(i!=a)
//          op2= travel(arr,space, i+1,j, a,b);
        
//         space[i][j]=Math.min(op2,op1);
        
//         return arr[i][j]+space[i][j];
        
//     }
    
    
//     public int minPathSum(int[][] grid) {
        
//          int m = grid.length;
//         int n= grid[0].length;
//         int[][] space = new int[m][n];
        
//         // return travel(grid, space, 0, 0,m-1,n-1);
        
        
//     }
}