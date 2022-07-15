class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int temp[] = new int[cost.length];
		temp[temp.length-1] = cost[cost.length-1];
		temp[temp.length-2] = cost[cost.length-2];
		int i = temp.length-3;
		while(i>=0) {
			temp[i] = cost[i] + Math.min(temp[i+1], temp[i+2]);
			i--;
		}
		return Math.min(temp[0], temp[1]);
        
    }
}