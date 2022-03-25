class Solution {
    public String addBinary(String a, String b) 
    {
             int i=a.length()-1;
        int j = b.length()-1;
        
        String res ="";
        int carry =0;
        
        while(i>=0 || j>=0)
        {
            int sum =carry;
            
            if(i>=0)
            {
                sum+= a.charAt(i)-'0';
                i--;
            }
             if(j>=0)
            {
                sum+= b.charAt(j)-'0';
                j--;
            }
            
            carry = (sum>1) ? 1 : 0;
            
            res = String.valueOf(sum%2) +res;
        }
        
        if(carry ==1)
            res = "1"+res;
        
        return res;
    }
}