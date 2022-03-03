class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<points.length;i++){
            int x2=points[i][0];
            int y2=points [i][1];
            if(x2==x||y2==y)
                if((Math.abs(x-x2)+Math.abs(y-y2))<min){
                    min=(Math.abs(x-x2)+Math.abs(y-y2));
                    index=i;
                }
         }
        return index;
    }
}