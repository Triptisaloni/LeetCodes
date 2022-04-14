class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        int n= nums.length;
        if(n<=1)
            return res;
        
        for(int i : nums)
        {
            if(set.contains(i))
                res.add(i);
            else
                set.add(i);
        }
        
        return res;
        
    }
}