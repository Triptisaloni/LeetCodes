public class Codec 
{
int key = 1;
HashMap<Integer,String> map = new HashMap<>();
    
    
 
public String encode(String longUrl) {
map.put(key,longUrl);
key++;
return Integer.toString(key-1);
}


public String decode(String shortUrl) 
{
	int tmp = Integer.parseInt(shortUrl);
	return map.get(tmp);
}
    
}