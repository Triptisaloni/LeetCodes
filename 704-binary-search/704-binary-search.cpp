class Solution {
public:
  int search(vector<int>& nums, int target){
      
      int size = nums.size();
      
  if( size == 0)
    return -1;

  int left = 0;
  int right = size;
      
  while(left < right)
  {
    
    int mid = left + (right - left) / 2;
      
    if(nums[mid] == target)
    return mid; 
    else if( target >nums[mid])
    left = mid + 1; 
    else 
    right = mid; 
  }

  
  // if(left != nums.size() && nums[left] == target) return left;
      
  return -1;
}
};