class Solution {
    public boolean find132pattern(int[] nums) {
        
       int len = nums.length;
        if (len < 3) {
            return false;
        }

        Stack<Integer> s = new Stack<>();
        int k = -1;
        
        for (int i = len - 1; i >= 0; i--) 
        {
            if (k > -1 && nums[k] > nums[i]) 
            {
                return true;
            }

            while (!s.isEmpty() && nums[i] > nums[s.peek()]) {
                k = s.pop();
            }

            s.push(i);
        }

        return false; 
        
    }
}