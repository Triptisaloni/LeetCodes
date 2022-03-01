class Solution {
    public int findDuplicate(int[] nums) {
	
        long l=0;
        long r=nums.length-1;
    
	   long mid;
        while(l<r){
            mid = l+(r-l)/2;
            if(hasGreaterCount(nums,mid)){
                r = mid;
            }else{
                l = mid+1;
            }
        }
        return (int)l;
    }
    public boolean hasGreaterCount(int[] nums, long mid){
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] <= mid) count++;
        }
    return count > mid;
    }
}