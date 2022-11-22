//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] S = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int ans = ob.countTriplets(nums);
            System.out.println(ans);         
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public int countTriplets(int[] nums){
        // code here
        int n=nums.length;
	    int cnt=0;
	    for(int i=1;i<n-1;++i)
	    {
	        int x=0;
	        int y=0;
	        int z1=i-1,z2=i+1;
	        
	        while(z1>=0)
	        {if(nums[z1]<nums[i])
	             {x++;}
	                z1--;
	            
	        }
	        while(z2<n)
	        {   if(nums[z2]>nums[i])
	                {y++;}
	                z2++;
	            
	        }
	        if(x!=0 || y!=0)
	        cnt+=(x*y);
	    }
	    return cnt;
    }
}