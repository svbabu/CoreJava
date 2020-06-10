
import java.util.stream.*;
import java.util.*;

class Student
{
	String id,name;
	public Student(String id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return id+" "+name;
	}
}
public class StreamWithMap
{
	public static void main(String args[])
	{
		Map<String,Student>  map=new HashMap();
		 map.put("B",new Student("1","A"));
		  map.put("D",	 new Student("3","B")); 
		  map.put("C",	 new Student("2","C"));
		  
		  //normal iterating map obj using stream 
		  
		  //Map<String,Integer> m=map.entrySet().stream().
		  //collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		  
		//sorting based on value(student::getName or student::getId)  
		Map<String,Student> sortedNewMap = map.entrySet().stream().sorted((e1,e2)->
        e1.getValue().getName().compareTo(e2.getValue().getName()))
		        
				//sorting based on key
				//e1.getKey().compareTo(e2.getKey()))

        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (e1, e2) -> e1,LinkedHashMap::new));
     sortedNewMap.forEach((key,val)->{
    System.out.println(key+ " = "+ val.toString());
});
List<Student> list=new ArrayList();
list.add(new Student("3","B"));
list.add(new Student("2","C"));
list.add(new Student("1","A"));
List<Student> li=list.stream().sorted((e1,e2)->e1.getId().compareTo(e2.getId())).collect(Collectors.toList());
	  li.forEach((s1->System.out.println(s1.toString())));
		 // List<String> list=Arrays.asList("D","C","A");
		   //   List<String> li=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//System.out.println(li+" ");			  
		  
	}
}