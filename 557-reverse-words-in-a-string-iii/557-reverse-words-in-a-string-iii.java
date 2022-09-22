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
    
//     public String reverseWords(String s)
//     {
//         String arr[] = s.split(" ");
//         String ans="";
        
//         for(int i=0; i<arr.length ;i++)
//         {
//             StringBuilder temp = new StringBuilder(arr[i]);
//             ans= ans+ temp.reverse().toString() +" ";
//         }
        
//         return ans.substring(0, ans.length()-1);
// //          to reduce space after last word
//     }
    
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
        
//         help(arr, start, n-1);---> this is done for last word because no ' ' is present at the end
        
        return String.valueOf(arr);
    }
}