class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)-> a[0]!=b[0] ? (b[0]- a[0]) : (b[1]- a[1]));
                                                                    
        
        for(int i: arr)
        {
            int diff = Math.abs(x-i);
            
            pq.add(new int[]{diff, i});
            
            if(pq.size()>k)
                pq.poll();
        }
        
        ArrayList<Integer> l = new ArrayList<>();
        
        while(!pq.isEmpty())
            l.add(pq.poll()[1]);
        
        Collections.sort(l);
        return l;
    }
    
}

class Pair implements Comparable<Pair>
{
    int diff; int val;
        
        public Pair(int diff, int val)
        {
            this.diff = diff;
            this.val = val;
        }
    
    @Override
    public int compareTo(Pair a)
    {
        return this.diff - a.diff;
    }
}