class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int r = matrix.length;
        int c = matrix[0].length;
        
        int i = 0, j=c-1;
        
        while(i<r && j>=0)
        {
            int curr =  matrix[i][j];
            
            if(target==curr)
                return true;
            else if(target<curr)
                j--;
            else
                i++;
        }
        
        return false;
        
    }
}