class Solution {
   public String reformatDate(String date) {
          HashMap<String,String> map= new HashMap<>();
         map.put("Jan","01");
         map.put("Feb","02");
         map.put("Mar","03");
         map.put("Apr","04");
         map.put("May","05");
         map.put("Jun","06");
         map.put("Jul","07");
         map.put("Aug","08");
         map.put("Sep","09");
         map.put("Oct","10");
         map.put("Nov","11");
         map.put("Dec","12");
       String[] s= date.split(" ");
        StringBuilder sb= new StringBuilder();
        sb.append(s[2]);
        sb.append("-");
        sb.append(map.get(s[1]));
        sb.append("-");
        
        int day=0;
        for(char c: s[0].toCharArray())
        {
            if(Character.isDigit(c))
                day=day*10+(c-'0');
        }
         
        if(day<10)
            sb.append(0);
            
        
        sb.append(day);
            
        return sb.toString();
        
    }
}