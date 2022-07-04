class Solution {
    public String getHint(String secret, String guess) {
        
          int bulls = 0 , cows = 0 , len = secret.length();
        
        int []scounts = new int[10];
        int []gcounts = new int[10];
        
        for(int i = 0 ; i < len ; i++)
        {
            if(guess.charAt(i) == secret.charAt(i))
            {
                bulls++;
            }
            else
            {
                scounts[secret.charAt(i)-'0']++;
                gcounts[guess.charAt(i)-'0']++;
            }
        }
        
        for(int i = 0 ; i < 10 ; i++)
        {
            cows += Math.min(scounts[i] , gcounts[i]);
        }
        
        return "" + bulls + "A" + cows + "B"; 
    }
}