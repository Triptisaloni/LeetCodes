class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> ss = new Stack<>();
                Stack<Character> tt = new Stack<>();
        
        for(char ch: s.toCharArray())
        {
           if(ch == '#'){
                if(!ss.isEmpty())
                    ss.pop();
                continue;
            }
            ss.push(ch);
        }
        
          for(char ch: t.toCharArray())
        {
            if(ch == '#')
            {
                if(!tt.isEmpty())
                    tt.pop();
                continue;
            }
            tt.push(ch);
        }

        
        String sans = "";
        String tans="";
        
        while(ss.size()!=0)
            sans+=ss.pop();
        
         
        while(tt.size()!=0)
            tans+=tt.pop();
        
        return (sans.equals(tans));
    }
}