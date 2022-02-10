/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int start = 1;
        int end = n;
        int res = n;
        while(start<=end)
        {
         int mid=start+(end-start)/2;
         boolean isbad = isBadVersion(mid); // check if version = mid is bad or not
         if(isbad)// if it is the bad version, then we check if there exists a bad version before mid
         {
            res = mid;
            end = mid-1;
         }
         else //if the version = mid is good , then we have check for later versions
         {
           start = mid+1;
         }
        }
        return res;
    }
}