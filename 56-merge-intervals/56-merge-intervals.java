class Solution {
    public int[][] merge(int[][] intervals) {
       
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
       ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        int rows = intervals.length;
        if(rows==1)
            return intervals;
        
        int [] prev = intervals[0];
        
        for(int i=1; i<rows; i++)
        {
            if(intervals[i][0] <= prev[1] )
            {
                prev[1] = Math.max(intervals[i][1], prev[1]);
            }
            
            else
            {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(prev[0]);
                temp.add(prev[1]);
                
                ans.add(temp);
                prev = intervals[i];
                
            }
        }
       
              ArrayList<Integer> temp = new ArrayList<>();
                temp.add(prev[0]);
                temp.add(prev[1]);
                
                ans.add(temp);
        int arr[][] = new int[ans.size()][2];
        
        for(int i=0; i<ans.size(); i++)
        {
            for(int j = 0; j<2; j++)
            {
                arr[i][j] = ans.get(i).get(j);
            }
        }
        
        return arr;
        
    }
}