class Solution {
    public void reverseString(char[] s) {
        
        int n= s.length;
        char temp;
        
        for(int i =0; i<n/2; i++)
        {
            temp=s[n-1-i];
            s[n-1-i]= s[i];
            s[i]= temp;
        }
        
        
        for(int i=0; i<n; i++ )
            System.out.print(s[i]+" ,");
        
        return;
    }
}