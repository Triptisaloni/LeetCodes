class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int n = heights.length, area = 0;
        
        int[] next = new int[n];
            nextSmaller(heights, n, next);
        
         int[] prev = new int[n];
            prevSmaller(heights, n, prev);
        
        for(int i=0; i<n ; i++)
        {
            int length = heights[i];
            int width = next[i] - prev[i] -1;
            
            area = Math.max(area, length*width);
        }
        return area;
        
    }
    
    public void nextSmaller(int[] arr, int n, int[] ans)
    {
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        
        for(int i=n-1; i>=0; i--)
        {
            while(s.peek()!=-1 && arr[s.peek()] >= arr[i])
                s.pop();
            
            ans[i] = s.peek();
            if(ans[i] == -1)
                ans[i] = n;
            
            s.push(i);
        }
    }
    
    public void prevSmaller(int[] arr, int n, int[] ans)
    {
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        
        for(int i=0; i<n; i++)
        {
            while(s.peek()!=-1 && arr[s.peek()] >= arr[i])
                s.pop();
            
            ans[i] = s.peek();
            
            s.push(i);
            // if(next[i] == 1)
            //     next[i] = n;
        }
    }
}