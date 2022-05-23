class Solution {
    
    public void help(char[] arr, int l, int r)
    {
        while(l<=r)
        {
            char temp = arr[l];
            arr[l]= arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    
    public String reverseWords(String s) {
        
        int n = s.length();
        if(n<=1)
            return s;
        
        char[] arr = s.toCharArray();
        
        int start =0;
        
        for(int i=0; i<=n; i++)
        {
            if(i==n || arr[i]==' ')
            {
                help(arr, start, i-1);
                start =i+1;
            } 
        }
        
//         for(int i=0; i<n; i++)
//         {
//             if(arr[i]==' ')
//             {
//                 help(arr, start, i-1);
//                 start =i+1;
//             }
        
//         }
        
//         help(arr, start, n-1);
        
        return String.valueOf(arr);
    }
}