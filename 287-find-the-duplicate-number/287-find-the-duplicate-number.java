class Solution {
    public int findDuplicate(int[] nums) {
        
	
	int slow = nums[0];
	int fast = nums[0];
	do {
		slow = nums[slow]; // one step pace
		fast = nums[nums[fast]]; // fast = fast.next.next i.e. 2 steps pace
	} while (slow != fast);

	slow = nums[0];
	while (slow != fast) {
		slow = nums[slow]; // one step pace
		fast = nums[fast]; // one step pace
	}
	return slow; // or fast
    }
}