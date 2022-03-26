// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            
            System.out.println();
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> ne=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(arr[i]<0) 
            ne.add(arr[i]);
            else 
            p.add(arr[i]);
        }
        
        int c=0;
        for(int i=0;i<p.size();i++)
        arr[c++]=p.get(i);
        
        for(int i=0;i<ne.size();i++) 
        arr[c++]=ne.get(i);
    }
}