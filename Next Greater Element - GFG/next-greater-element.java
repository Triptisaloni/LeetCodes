// { Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}



// } Driver Code Ends


class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long[] res = new long[n];
        
        if(n==1)
        {
            res[0]=-1;
            return res;
        }
        for(int i=0; i<n; i++)
        {
            res[i] =-1;
        }
        
        Stack<Integer> s = new Stack<>();
        s.push(0);
        
        for(int i=1; i<n; i++ )
        {
            int peek = s.peek();
            while(s.size()!=0 && arr[s.peek()]<arr[i])
            {       
                res[s.peek()] = arr[i];
                s.pop();
            }
            
            s.push(i);
        }
        
       return res; 
    } 
}