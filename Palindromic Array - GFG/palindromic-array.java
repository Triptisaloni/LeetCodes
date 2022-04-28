// { Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
    public static boolean isPalindrome(int n)
    {
        int p=n;
        int rem =0,rev =0;
        
        while(n>0)
        {
            rem = n%10;
            rev = rev*10+rem;
            n/=10;
        }
        
        return(rev==p);
    }
    
    
	public static int palinArray(int[] a, int n)
           {
                  for(int i=0; i<n; i++)
                  {
                      if(!isPalindrome(a[i]))
                      return 0;
                  }
                  
                  return 1;
           }
}