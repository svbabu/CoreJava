
import java.util.*;

 class ArrayListTest
{
	public static void main(String args[])
	{
		List<String> list=new ArrayList();
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("2");
	Iterator<String> it=list.iterator();
	while(it.hasNext())
	{
		String test=it.next();
		System.out.print(test+" loop ");
		if(test.equals("5")){
         it.remove();
		}
	   list.set(2,"3");
        //if(test.equals("3"))
         //list.remove("3");			
   
		
	}
	 System.out.println(list+"main ");
	
	}
}