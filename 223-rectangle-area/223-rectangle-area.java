class Solution {
    
    public int change(int n)
    {
        if(n<0)
            return n*-1;
        
        return n;
    }
    
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) 
    {
         int overlapArea, sumArea = (ay2 - ay1) * (ax2 - ax1) + (by2 - by1) * (bx2 - bx1);
        
        // no-overlapping area.
        if (bx1 >= ax2 || bx2 <= ax1 || by1 >= ay2 || by2 <= ay1) {
            overlapArea = 0;
        } else {
            // the overlapped area
            overlapArea = (Math.min(bx2, ax2) - Math.max(bx1, ax1)) * (Math.min(by2, ay2) - Math.max(by1, ay1));
        }
        
        return sumArea - overlapArea;
//         ax1= change(ax1);
//         ay1= change(ay1);
//         ax2= change(ax2);
//         ay2= change(ay2);
//         bx1= change(bx1);
//         by1= change(by1);
//         bx2= change(bx2);
//         by2= change(by2);
        
//         int area1 = (ay1+ay2)*(ax1+ax2);
//         int area2 = (by1+by2)*(bx1+bx2);
        
//         int commonx = Math.min(ax2,bx2) - Math.min(ax1,bx1);
//          int commony = Math.min(ay2,by2) - Math.min(ay1,by1);
        
//         int common = commonx*commony;
        
//         return area1+area2 - common;
    }
}