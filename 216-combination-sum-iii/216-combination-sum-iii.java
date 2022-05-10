class Solution {
    
       
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<>();
        
        
    public void findCombinations(int k, int n, int start)
    {
        if(k==0 && n==0)
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=start; i< 10; i++)
        {
                temp.add(i);
            findCombinations(k-1,n-i, i+1);
                temp.remove(temp.size()-1);
        }
        
    
    }
    
    public List<List<Integer>> combinationSum3(int k, int n)
    {
        findCombinations(k,n,1);
        return res;
        
    }
    
    
}