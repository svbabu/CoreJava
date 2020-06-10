import java.util.*;
import java.util.stream.*;

class Dept
{
	Integer id;
	String name;
public Dept(int id,String name)
{
	this.id=id;
	this.name=name;
}
public Integer getId()
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

public class StreamFilters
{
public static void main(String args[])
{
	Dept d1=new Dept(2,"Singu");
	Dept d2=new Dept(1,"Sree");
	Dept d3=new Dept(3,"mukesh");
	Dept d4=new Dept(6,"rao");
	Dept d5=new Dept(5,"ganga");
	List<Dept> depts=new ArrayList();
	depts.add(d1);
	depts.add(d2);
	depts.add(d3);
	depts.add(d4);depts.add(d5);
	String  names="Singu";
	
	List<Dept> list=depts.stream().filter((Dept d)->d.getId()%2==0 && "Singu".equals(d.getName())).collect(Collectors.toList());
	
	list.forEach(System.out::println);
}
}