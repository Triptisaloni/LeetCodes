class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
//         int r = matrix.length;
//         int c = matrix[0].length;
        
//         int i = 0, j=c-1;
        
//         while(i<r && j>=0)
//         {
//             int curr =  matrix[i][j];
            
//             if(target==curr)
//                 return true;
//             else if(target<curr)
//                 j--;
//             else
//                 i++;
//         }
        
//         return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0, r= m*n-1;
        
        while(l<=r)
        {
            int mid = (l+r)/2;
            
            int ele = matrix[mid/n][mid%n];
            
              if(target==ele)
                return true;
            else if(ele<target)
                l = mid+1;
            else
                r= mid-1;
           
            
    }
            return false;
}}