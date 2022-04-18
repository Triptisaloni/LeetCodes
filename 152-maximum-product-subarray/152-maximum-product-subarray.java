class Solution {
    public int maxProduct(int[] nums) {
        
        int n = nums.length;
        
         int max_ending_here = nums[0];
 
    // min negative product ending
    // at the current position
    int min_ending_here = nums[0];
 
    // Initialize overall max product
    int max_so_far = nums[0];
    /* Traverse through the array.
    the maximum product subarray ending at an index
    will be the maximum of the element itself,
    the product of element and max product ending previously
    and the min product ending previously. */
    for (int i = 1; i < n; i++)
    {
        int temp = Math.max(nums[i],Math.max( nums[i] * max_ending_here, nums[i] * min_ending_here));
        min_ending_here = Math.min(nums[i], Math.min(nums[i] * max_ending_here, nums[i] * min_ending_here));
        max_ending_here = temp;
        max_so_far = Math.max(max_so_far, max_ending_here);
    }
    return max_so_far;
    }
}