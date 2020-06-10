
import java.util.stream.*;
import java.util.*;

class Stud1
{
	String name;
	public Stud1(String name)
	{
		this.name=name;
		
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return " name:"+name;
	}
}
public class TestProgram

{

    public static void main(String args[])
	{
	 List<Stud1> list=new ArrayList<>();
	  list.add(new Stud1("B"));
	  list.add(new Stud1("A"));
	  list.add(new Stud1("B"));
	  list.add(new Stud1("A"));
	  
	  //below code make a sort ele in list using stream method as distinct
	 //List<Integer> li= list.stream().distinct().collect(Collectors.toList());
	 
	// for(Object s:li)
	 //{
	// System.out.println(s+" ");
	  
	   
	 for(int i=0;i<list.size();i++)
	 {
		for(int j=i+1;j<list.size();j++)
	    {
		 if(list.get(i).getName().equals(list.get(j).getName()))
		 {
			 list.remove(j);
			  j--;
		 }
	 
	 
	}
	 }
Collections.sort(list,new Comparator<Stud1>()
{
	public int compare(Stud1 s1,Stud1 s2)
	{
		return s1.getName().compareTo(s2.getName());
	}
});
for(Stud1  res:list)
{
	System.out.print(res+" ");
	
}		
			 
			 
			 
	}
}	
			 
			 
	 