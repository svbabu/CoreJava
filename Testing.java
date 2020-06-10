import java.util.*;
import java.util.stream.*;
class Testing
{
	void m1(int i,double d)
	{
		System.out.println(i+" "+d);
	}
	void m1(int i,float f)
	{
		System.out.println(" "+i+" "+f);
	}

	
	public static void main(String args[])
	{
		 Testing test=new Testing();
		test.m1(10,20f);
		test.m1(22,12);
		
		Optional<String> Got=Optional.of("testing optinal");
		 Optional<String> nothing=Optional.empty();
		    
			//Got.ifPresent(s->System.out.println("getting value"));
			//nothing.ifPresent(s->System.out.println("nothing value"));
			
		List<Integer> evenNum=Arrays.asList(2,4,6);
		List<Integer> oddNum=Arrays.asList(1,3,5);
		List<List<Integer>> listOfNum=Arrays.asList(evenNum,oddNum);
		System.out.println(listOfNum);
		List<Integer> listNum=listOfNum.stream().flatMap(s->s.stream()).collect(Collectors.toList());
		System.out.println(listNum); 
		try{
		String s=null;
	if(s.equals("abc"))
	System.out.println("same");
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		
		
}
}