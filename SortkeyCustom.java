import java.util.*;
import java.util.stream.*;
class Emp{
	
	Integer id;
	String name;
	
	
	
	public Emp(Integer id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	public String toString()
	{
		
		return this.id+" "+this.name;
	}
	
	public String getName()
	{
		return this.name;
	}
	public Integer getId()
	{
	
	return this.id;
	} 
	
	 public boolean equals(Object other)
	{
		//Emp emp=(Emp)obj;
		//if(this.id.equals(emp.getId()))
		//return true;
	    //return false;Emp otherEmp=((EmpDetect)other).getEmp();
		//Emp otherEmp=((EmpDetect)other).getEmp();
		 if (other instanceof Emp) {
		 return ((Emp) other).id ==id;
		 }
		 return false;
	}
	/* public int hashCode()
	{
	//return this.id;
	int hashCode=this.getId().hashCode();
		return hashCode;
	}  */
	
	public static Map<Emp,String> sortById(Map<Emp,String> map)
	{
		 
		Map<Emp,String> mapObj=map.entrySet().stream().sorted((e1,e2)->
		e2.getKey().getId().compareTo(e1.getKey().getId())).collect(
		Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		return map;
	}
	
	public static List<Emp> sortByLiId(List<Emp> list)
	{    
	   
		
		List<Emp> li=list.stream().sorted((e1,e2)->e2.getId().compareTo(e1.getId())).collect(Collectors.toList());
		return li;
	}
}

public class SortKeyCustom
{public static void main(String args[])
	{
		Map<Emp,String> map=new HashMap();
		map.put(new Emp(1,"B"),"B");
		map.put(new Emp(3,"C"),"C");
		map.put(new Emp(2,"D"),"D");
		map.put(new Emp(5,"A"),"A");
		map.put(new Emp(5,"A"),"A");
		
		Map<Emp,String> mapObj=Emp.sortById(map);
		
		mapObj.forEach((key,value)->{
		System.out.println(key.toString()+" "+value);
		});
		
		System.out.println(" GAP ");
		//list sorting
		List<Emp> list=new ArrayList<>();
		Emp emp1=new Emp(1,"B");
		Emp emp2=new Emp(3,"C");
		Emp emp3=new Emp(2,"D");
		Emp emp4=new Emp(5,"C");
		Emp emp5=new Emp(5,"A");
		list.add(emp1);
		list.add(emp2);
			list.add(emp3);
				list.add(emp4);
					list.add(emp5);
					
		List<Emp> li=Emp.sortByLiId(list);
		
		li.forEach((emp)->System.out.println(emp.toString()));
		
		//remove duplicates from list using another 
		List<Emp> newList=new ArrayList<>();
        
        for(Emp empObj:list){
			if(!newList.contains(empObj)){
				newList.add(empObj);
			}
		}	
		 list.clear();
		 list.addAll(newList);
		for(Emp e:list)
		{
		System.out.println("::::::;"+e);
		}
		
	    		

	}
}
		
		
		
		