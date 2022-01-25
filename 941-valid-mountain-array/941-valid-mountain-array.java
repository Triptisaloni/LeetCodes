class Solution {
    public boolean validMountainArray(int[] arr)
    {
        if(arr.length<3)
            return false;
        
        int len = arr.length;
        int i =0;
        
        
        while(i<len-1 &&arr[i]<arr[i+1])
            i++;
        
        if(i==0 || i ==len-1)
            return false;
        
        while(i<len-1 && arr[i] >arr[i+1])
            i++;
        
        return i==len-1;
    }
}