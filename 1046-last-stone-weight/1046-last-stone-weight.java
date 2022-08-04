class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue pq = new PriorityQueue<>(Collections.reverseOrder());
        
            for(int i=0;i<stones.length;i++)
                pq.add(stones[i]);
        
        
            while(pq.size()>0)
    {
            if(pq.size()==1)
                return (int)pq.poll();
                
            int a = (int)pq.poll();
            // pq.poll();
            int b = (int)pq.poll();
            // pq.poll();
                
            if(a!=b)
            pq.add(Math.abs(a-b));
    }
        
return 0;
    }
}