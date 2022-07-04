class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        int[] ans = {-1,-1};
        int n = nums.length;
        
        if(n<=1)
            return ans;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++)
        {
            map.put(nums[i], i);
            
        }
        
        for(int i=0; i<n; i++)
        {
            int diff= target-nums[i];
            // int index = map.get(diff);
            
            if(map.containsKey(diff) && map.get(diff)!=i)
            {
                ans[0]= i;
                ans[1]=map.get(diff);
                 return ans;
            }
        }
        
        
        return ans;
    }
}