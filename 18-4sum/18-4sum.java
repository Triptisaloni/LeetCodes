class Solution {
    List<List<Integer>> res = new ArrayList<>();
    Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> fourSum(int[] nums, int target) { 
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length - 3 ; i++){
            if(i == 0 || nums[i - 1] != nums[i])
                threeSum(i, nums, target);
        }
        res.addAll(set);
        return res;
    }
    public void threeSum(int i , int[] nums, int target){
        for(int j = i + 1 ; j < nums.length - 2 && j != i; j++){
            twoSum(i, j, nums, target);
        }
    }
    public void twoSum(int i, int j, int[] nums, int target){
        int lo = j + 1;
        int hi = nums.length - 1;
        int sum = 0;
        while(lo < hi){
            sum = nums[lo] + nums[hi] + nums[i] + nums[j];
            if(sum < target)
                lo++;
            else if(sum > target)
                hi--;
            else{
                set.add(List.of(nums[i], nums[j], nums[lo++], nums[hi--]));
                while(lo < hi && nums[lo] == nums[lo - 1])
                    lo++;
            }
        }
    }
}