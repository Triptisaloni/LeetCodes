import java.util.*;

class Solution {
    public List<Integer> intersection(int[][] nums) 
    {
        HashMap<Integer,Integer> map =new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        int m = nums.length, n = nums[0].length;

        if(m==1)
        {
            for(int i=0; i<n;i++)
                ans.add(nums[0][i]);
        } 
        
        for(int i=0; i<n; i++)
        {
            map.put(nums[0][i],1);
        }
        
        for(int i=1; i<m; i++)
        {
            for(int j=0; j<nums[i].length; j++)
            {
                if(map.containsKey(nums[i][j]))
                {
                    int val = map.get(nums[i][j]);
                    map.put(nums[i][j], val+1);
                    
                    if(val+1==m)
                        ans.add(nums[i][j]);
                }
            }
        }
        
       Collections.sort(ans);
        return ans;
    }
}