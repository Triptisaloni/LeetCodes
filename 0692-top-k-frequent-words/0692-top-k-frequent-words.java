class Solution {
    
   public List<String> topKFrequent(String[] words, int k) 
{
    Map<String,Integer> map=new HashMap<>();
       
   for(int i=0;i<words.length;i++)
   {
       map.put(words[i],map.getOrDefault(words[i],0)+1);
   }
       
    List<String> li=new ArrayList<>();
       
    Queue<String> pq=new PriorityQueue<>(new Comparator<>()
    {
       public int compare(String a,String b)
       {
           if(map.get(a)-map.get(b)==0)
               return a.compareTo(b);
           else
               return map.get(b)-map.get(a);
       }
    });
    pq.addAll(map.keySet());
    while(k-->0)
    {
        li.add(pq.poll());
    }
    return li;
}
}
