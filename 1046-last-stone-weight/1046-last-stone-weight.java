class Solution {
    public int lastStoneWeight(int[] stones) 
    {
            
        int n = stones.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : stones)
            list.add(i);
        
        
        while(list.size()>1)
        {
            Collections.sort(list);
            
            int y =  list.get(list.size()-1);
            list.remove(list.size()-1);
            
            int x =  list.get(list.size()-1);
            list.remove(list.size()-1);
            
            if(x!=y)
                list.add(y-x);
                
        }
        
        if(list.isEmpty())
            return 0;
        else
            return list.get(0);
    }
}