class Solution {
    public String reverseVowels(String s) {
        
        HashSet<Character> set = new HashSet<>();
        
        set.add('a'); set.add('A');
        set.add('e'); set.add('E');
        set.add('i'); set.add('I');
        set.add('o'); set.add('O');
        set.add('u'); set.add('U');

        char[] array = s.toCharArray();
        int l = 0, r = array.length-1;
        
        while(l<r)
        {
            if(set.contains(array[l]) && set.contains(array[r]) )
            {
                char c = array[l];
                array[l]= array[r];
                array[r] = c;
                
                l++; r--;
            }
            else if(set.contains(array[l]))
                r--;
            else if(set.contains(array[r]))
                l++;
            else
               { l++; r--;}
        }
        
        String ans = "";
        for(int i=0; i<array.length; i++)
            ans+=array[i];
        
        return ans;
    }
}