class Solution {
    
     public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m= matrix.length;
        int n = matrix[0].length;
        
        if(target < matrix[0][0]  && target > matrix[m-1][n-1])
            return false;
        
        
        for(int i=0; i<m ; i++)
        {
            if(target>=matrix[i][0] && target<=matrix[i][n-1])    
            {
                if(binarySearch(matrix[i], target) != -1)
                    return true;
                else
                    return false;
            }
        }
        return false;
        
        
        // int i=0;
        
//        while(i<m)
//        {
//            if(target<= matrix[i][n-1])
//                break;
//        }
        
        
//         int l=0, r= n-1;
        
// //         while(l<=r)
// //         {
// //             int mid = l+(r-l)/2;
            
// //             if(target==matrix[i][mid])
// //                 return true;
            
// //             else if(mid!=l && target< matrix[i][mid])
// //                 r=mid-1;
// //             else if(mid!=r && target> matrix[i][mid])
// //                 l=mid+1;
// //         }
        
//         for(int j=0; j<n; j++)
//         {
//             if(matrix[i][j] ==target)
//                 return true;
//             if(matrix[i][j]> target)
//                 return false;
//         }
        
//         return false;
    }
}