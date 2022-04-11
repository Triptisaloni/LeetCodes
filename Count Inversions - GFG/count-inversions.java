// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    static long merge(long arr[], int l, int m, int r )
    {
        long inv=0;
        int n1 = m+1-l;
        int n2 =(r+1)-(m+1);
        
        long a[] = new long[n1];
        
        for(int i=0; i<n1; i++)
        a[i] = arr[l+i];
        
        long b[] = new long[n2];
        for(int i=0; i<n2; i++)
        b[i] = arr[m+1+i];
        
        
        int i=0, j=0, k=l;
        
        while(i<n1 && j<n2)
        {
            if(a[i] <= b[j])
            {
                arr[k]= a[i];
                k++; i++;
            }
            
            else
            {
                arr[k]= b[j];
                j++; k++;
                inv+= n1-i;            
                
            }
        }
        
        while(i<n1)
        {
            arr[k] = a[i];
            k++; i++;
        }
         while(i<n2)
        {
            arr[k] = b[j];
            k++; j++;
        }
        
        
        return inv;
    }
    
    static long mergeSort(long arr[], int l, int r)
    {
        long count =0;
        
        if(l<r)
        {
            int mid = (l+r)/2;
            count+= mergeSort(arr, l, mid);
             count+= mergeSort(arr,mid+1, r);
              count+= merge(arr, l, mid, r);
        }
        
        return count;
    }
    
    static long inversionCount(long arr[], long N)
    {
       if(N<=1)
       return 0;
       
       return mergeSort(arr, 0,(int)(N-1));
    }
}