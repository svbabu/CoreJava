
import java.util.*;
class StreamWithMapSort
{
	
	public Map<String,Integer> sortByValue( Map<String,Integer> map)
	{
		
		
return map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }	
		
public static void main(String args[])
{
 Map<String, Integer> wordCounts = new HashMap();
        wordCounts.put("USA", 100);
        wordCounts.put("jobs", 200);
        wordCounts.put("software", 50);
        wordCounts.put("technology", 70);
        wordCounts.put("opportunity", 200);
		   
		Map<String,Integer> map=sortByValue(wordCounts);
		System.out.println(map);
}}
	