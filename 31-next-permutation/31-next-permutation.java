class Solution {
    public void nextPermutation(int[] nums) {
        
        if(nums.length<=1)
            return;
        int n = nums.length;
        
        int i = n-2;
        
        while(i>=0 && nums[i]>=nums[i+1])
            i--;
        
        int x = i;
        
        if(x>=0)
        {
            int y = n-1;
            
            while(nums[y]<=nums[x])
                y--;
            
            swap(nums, x, y);
        }
        reverse(nums, x+1, n-1);
    }
    
    public void swap(int [] arr, int i, int j)
    {
        int temp= arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    
    public void reverse(int [] arr, int i, int j)
    {
        while(i<j)
            swap(arr, i++, j--);
    }
}