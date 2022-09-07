class Solution {
    public int countOdds(int low, int high) {
        
        int con = high-low+1;
        
        if(con%2==0)
            return con/2;
        
        if(high%2==0)
            return con/2;
        else
            return con/2 +1;
    }
}