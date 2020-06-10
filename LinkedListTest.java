
import java.util.*;
import java.util.stream.*;
class ComparatorTest implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		return s2.compareTo(s1);
	}
}
class LinkedListTest
{
	String name;
	public LinkedListTest(String name)
	{
		this.name=name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public String toString()
	{
		return "name "+name;
	}
		
	public static void main(String args[])
	{
		//Set<String> list=new TreeSet<>(new ComparatorTest());
				//Set<String> list=new TreeSet<>();

						List<LinkedListTest> list=new ArrayList<>();

		list.add(new LinkedListTest("C"));
		list.add(new LinkedListTest("A"));
		list.add(new LinkedListTest("D"));
		
		//Collections.sort(list,(s1,s2)->s2.getName().compareTo(s1.getName()));
		//list.forEach((s)->System.out.println(s.getName()));
		List<LinkedListTest> testSream=list.stream().sorted((s1,s2)->
		s1.getName().compareTo(s2.getName())).collect(Collectors.toList());
        testSream.forEach((s)->System.out.println(s));	
	}
}
		
