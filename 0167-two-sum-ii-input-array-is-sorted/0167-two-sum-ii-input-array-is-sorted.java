class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] ans;
        
        int l=0, r= numbers.length-1;
        
        while(l<r)
        {
            int sum = numbers[l] + numbers[r];
            
            if(sum == target)
                {ans =new int[]{l+1, r+1};
                return ans; }
            else if(target< sum)
                r--;
            else
                l++;
        }
        
        ans = new int[]{-1, -1};
        return ans;
    }
}