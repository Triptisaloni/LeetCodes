class Solution {
    
    public void swap(int a, int b)
    {
        int temp = a;
        a=b;
        b= temp;
        
        return;
    }
    
    public void reverse(int [] arr, int l, int r)
    {
        while(l<=r)
        {
            // swap(arr[l] , arr[r]);
            
            int temp = arr[l];
            arr[l]= arr[r];
            arr[r]= temp;
            l++;
            r--;
            
        }
        return;
        
    }
    
    
    public void rotate(int[] nums, int k) 
    {
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, n-1 );
        // reverse (nums, n-k,n-1);
        reverse(nums, 0, k-1);
        reverse (nums, k,n-1);
        
        
    }
}