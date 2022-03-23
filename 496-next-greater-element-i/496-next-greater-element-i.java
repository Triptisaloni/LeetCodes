import java.util.*;
class Solution {
    
    
    public static int[] result(int[] arr, int n)
    { 
        int[] res = new int[n];
        
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
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] res =  result(nums2, nums2.length);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums2.length; i++)
        {
            map.put(nums2[i], res[i]);
        }
        
        
        for(int i=0; i<nums1.length ; i++)
        {
            nums1[i] = map.get(nums1[i]);
        }
        
        return nums1;
    }
}