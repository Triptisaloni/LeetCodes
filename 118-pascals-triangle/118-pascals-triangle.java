class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0; i<numRows ; i++)
        {

                List<Integer> curr = new ArrayList<>();
                  List<Integer> prev = null;
            
            if(i!=0)
                prev = ans.get(ans.size()-1);
            
            for(int j = 0; j<=i; j++)
            {
                if(j==0 || j==i)
                    curr.add(1);
                else if(prev!=null)
                    curr.add(prev.get(j)+ prev.get(j-1));
            }
            
            ans.add(curr);
        }
        
        return ans;
        
    }
}