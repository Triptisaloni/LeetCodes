class Solution {
    public int[] numsSameConsecDiff(int n, int k)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=1; i<10; i++)
        help(n-1, k, ans, i);
        
        int arr[] = new int[ans.size()];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = ans.get(i);
        }
        
        return arr;
    }
    
   public void help(int n, int k, ArrayList<Integer> ans, int number)
   {
       if(n==0)
       {
           ans.add(number);
           return;
       }
       
       int prevDigit = number%10;
       
       if(prevDigit +k <=9 )
           help(n-1, k, ans, number*10 + (prevDigit+k));
       if(k!=0 && prevDigit-k>=0)
                     help(n-1, k, ans, number*10 + prevDigit-k);
       
       return;
 
   }
    
//         private void dfs(int num, int n, final int k, List<Integer> ans) {
//         if(n == 0) {
//             ans.add(num);
//             return;
//         }
//         int lastDigit = num % 10;
//         if(lastDigit + k < 10) dfs(num * 10 + lastDigit + k, n - 1, k, ans);
//         if(k != 0 && lastDigit - k >= 0) dfs(num * 10 + lastDigit - k, n - 1, k, ans);
//     }
    
//      public int[] numsSameConsecDiff(int n, int k) {
//         List<Integer> ans = new ArrayList<>();
//         if(n == 0) {
//             ans.add(0);
//         }
        
//         for(int d = 1; d < 10; d++) {
//             dfs(d, n - 1, k, ans);
//         }
        
//         for(int i=0; i<ans.size();i++)
//         {
//            arr[i]= ans.get(i);
//         }
         
//          return arr;
}