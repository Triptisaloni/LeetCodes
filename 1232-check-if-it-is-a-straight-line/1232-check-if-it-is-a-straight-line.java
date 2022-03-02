class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        
           if(coordinates.length < 3)
            return true;
        
        for(int i=1; i<coordinates.length-1; i++){
                int m1 = (coordinates[i][1] - coordinates[i-1][1]) * (coordinates[i+1][0] - coordinates[i][0]);
                
                int m2 = (coordinates[i+1][1] - coordinates[i][1]) * (coordinates[i][0] - coordinates[i-1][0]) ;
                
                if(m1 != m2)
                    return false;
            }
        return true;
    }
}