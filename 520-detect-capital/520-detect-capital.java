class Solution {
    public boolean detectCapitalUse(String word) {
        
        
        int len = word.length();
        if(len<=1)
            return true;
        
        // for(int i =0; i<len; i++)
        // {
        //     if(word.charAt(i)>=97 && word.charAt(i)<=122)
        //         return false;
        // }
        
        if(word.charAt(0)>=97 && word.charAt(0)<=122)
        {
            for(int i=1; i<len; i++)
            {
                if(word.charAt(i)>=65 && word.charAt(i)<=90)
                      return false;
            }
        }
        
        
        else
        {
            if(word.charAt(1)>=97 && word.charAt(1)<=122)
            {
 for(int i=2; i<len; i++)
            {
                if(word.charAt(i)>=65 && word.charAt(i)<=90)
                      return false;
            }
            }
            
            else
            {
 for(int i=2; i<len; i++)
            {
                if(word.charAt(i)>=97 && word.charAt(i)<=122)
                      return false;
            }
            }
        
        }
        
        return true;
    }
}