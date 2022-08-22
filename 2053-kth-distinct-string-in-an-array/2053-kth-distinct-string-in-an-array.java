class Solution {
    public String kthDistinct(String[] arr, int k) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++)
        {
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i])+1);
            else
                map.put(arr[i], 1);
        }
        
        int count=0;
        // String ans;
        
        for(int i=0; i<arr.length; i++)
        {
            String s = arr[i];
            
            if(map.get(s)==1)
                count++;
            
            if(count==k)
                return s;
        }
        
        return "";
    }
}