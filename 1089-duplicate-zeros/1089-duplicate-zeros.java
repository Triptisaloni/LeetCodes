class Solution {
    public void duplicateZeros(int[] arr) {
        
        int n= arr.length;
        
        if(n==0)
            return;
        
        int [] res = new int[n];
        
        // int i =0;
        int j=0;
        
        for(int i=0; i<n; i++)
        {
            res[j]=arr[i];
            if(res[j]==0 && j<n-1)
            {
                
                res[j+1]=0;
                j++;
            }
            j++;
            
            if(j>=n)
                break;
        }
        
        
        for(int i=0; i<n;i++ )
        {
            arr[i]= res[i];
        }
    }
}