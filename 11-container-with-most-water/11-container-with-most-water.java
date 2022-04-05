class Solution {
    public int maxArea(int[] height) {
        
        int n= height.length;
        int l=0,r=n-1, max =0, h = 0,curr=0;
        
        while(l<r)
        {
            int width = r-l;
            
            if(height[l]<height[r])
            {
                h = height[l];
                l++;
            }
            else if(height[l]>height[r])
            {
                h = height[r];
                r--;
            }
            else
            {   h = height[l];
                l++;
                r--;
            }
            
            curr = h*width;
            max= Math.max(curr, max);
        }
        
        return max;
    }
}