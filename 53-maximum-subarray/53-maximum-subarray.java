class Solution {
public int maxSubArray(int[] a) {
int max=-1000000;
int cur=0;
for(int i=0;i<a.length;i++){
cur+=a[i];
if(cur>max) max=cur;
if(cur<0) cur=0;
}
return max;
}
}