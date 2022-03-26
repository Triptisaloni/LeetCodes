class Solution {
    public int trap(int[] height) 
    {
        int n = height.length;
        if(n<=2)
            return 0;
        
        int vol =0;
        
        int left[] = new int[n];
        left[0]= height[0];
        
        int right[] =new int[n];
        right[n-1] = height[n-1];
        
        for(int i=1;i<n;i++)
            left[i] = Math.max(left[i-1], height[i]);
        
        for(int j=n-2; j>=0; j--)
            right[j]=Math.max(right[j+1], height[j]);
        
        for(int i=1; i<n-1; i++)
        {
            vol+= Math.min(left[i], right[i])-height[i]; 
        }
        
        return vol;
    }
}