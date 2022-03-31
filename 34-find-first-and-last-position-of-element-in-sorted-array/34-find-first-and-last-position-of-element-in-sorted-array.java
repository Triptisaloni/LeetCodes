class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[] {-1, -1};
        
        int low = binarySearch(nums, target, true);
        int high = binarySearch(nums, target, false);
        
        return new int[] {low, high};
    }
    
    private int binarySearch(int[] nums, int target, boolean isLowBound) {
        int left = 0;
        int right = nums.length - 1;
        int res = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target < nums[mid]) {
                right = mid - 1;
            }
            else if (target > nums[mid]) {
                left = mid + 1;
            }
            else {
                res = mid;
                if (isLowBound) {
                    // searching for lower bound, forcing to the left
                    right = mid - 1;
                }
                else {
                    // searching for higher bound, forcing to the right
                    left = mid + 1;
                }
            }
        }
        
        return res;
    }
}