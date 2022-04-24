class Solution {
    public int firstMissingPositive(int[] nums) {
        
         Arrays.sort(nums);
        int min = 1;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] <= 0) {
                continue;
            } else if (nums[j] == min) {
                min++;
                continue;
            }
        }
        return min;
        
    }
}