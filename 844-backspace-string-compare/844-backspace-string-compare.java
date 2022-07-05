class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> ss = new Stack<>();
     Stack<Character> tt = new Stack<>();

        // String resS="";
        // String resT="";
        for(int i=0; i<s.length(); i++)
        {
             if(s.charAt(i)=='#' && !ss.isEmpty())
                ss.pop();
            if(s.charAt(i)!='#')
                ss.push(s.charAt(i));
        }
        
        
        for(int i=0; i<t.length(); i++)
        {
            if(t.charAt(i)=='#' && !tt.isEmpty())
                tt.pop();
            if(t.charAt(i)!='#')
                tt.push(t.charAt(i));
        }
        
        return ss.equals(tt);
    }
}