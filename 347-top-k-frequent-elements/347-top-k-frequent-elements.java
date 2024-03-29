class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int [] ans = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i: nums)
        {
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else
                map.put(i, 1);
        }
        
        PriorityQueue<int[]> pq  = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        
        for(int e : map.keySet())
        {
            pq.add(new int[]{map.get(e), e});
            if(pq.size()>k)
                pq.poll();
        }
        
        for(int i=0; i<k; i++)
        {
            ans[i] = pq.peek()[1];
            pq.poll();
        }
        
        return ans;
    }
}