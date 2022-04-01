// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {

        int sum = arr[0];
        int l=0, r=0;
        ArrayList<Integer> res = new ArrayList<>();
        
        while(l<n && r<n)
        {
            if(sum == s)
            {
                res.add(l+1);
                res.add(r+1);
                return res;
            }
            // return {l, r};
            
            else if(sum<s )
            {
                r++;
                if(r==n)
                break;
                
                sum+= arr[r];
            }
            else if(sum>s )
            {
                sum-= arr[l];
                l++;
            }
        }
        
        res.add(-1);
        return res;
    }
}