class Solution {
    
    public int binary(int [] arr, int target)
    {
        int l=0, r=arr.length-1;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            
            if(arr[mid]== target)
                return mid;
            
            else if(target<arr[mid])
                r--;
            else
                l++;
        }
        
        return -1;
    }
    
    public int[] searchRange(int[] nums, int target) {
        
        int n= nums.length;
        int res[] = new int[2];
        res[0]=-1;
        res[1]=-1;
        
        if(n==0)
            return res;
        
        int index = binary(nums, target);
        
        if(index==-1)
            return res;
        
        int l=index, r=index;
        
        while(l>=0 && nums[l]==target)
        {
            l--;
        }
         while(r<n && nums[r]==target)
        {
            r++;
        }
        
        res[0]= l+1;
        res[1]=r-1;
        
        return res;
    
        
    }
}