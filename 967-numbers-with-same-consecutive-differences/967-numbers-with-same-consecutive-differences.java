class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i =1; i<10; i++)
            q.add(i);
        
        int count =1;
        
        while(!q.isEmpty())
        {
            if(count==n)
                break;
            
            int size = q.size();
            for(int i=0; i<size; i++)
            {
                int curr = q.poll();
                int last = curr%10;
                
 for(int j=0;j<=9;j++){
                    if(Math.abs(last-j) == k)
                        q.add(curr*10+j);
                }
            }
            count++;
            
        }
        
        int arr[] = new int[q.size()];
      
        int ind =0;
        while(!q.isEmpty())
            arr[ind++]=q.poll();
        
        
        return arr;
       }
}