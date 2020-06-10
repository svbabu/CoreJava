import java.util.*;

 public final class ImmutableTest
{
	private final Integer id;
	private final String name;
	private final HashMap<String,String> hmTest;
	public ImmutableTest(Integer id,String name,HashMap<String,String> hm)
	{
		this.id=id;
		this.name=name;
		//hmTest=hm;
	      HashMap<String,String> tempMap=new HashMap<String,String>();
          String key;
		  String value;
		Iterator<String> it=hm.keySet().iterator();
		while(it.hasNext())
		{
			key=it.next();
			 value=tempMap.get(key);

			tempMap.put(key,value);
			 
			
		}
		this.hmTest=tempMap;  
	}
	public Integer getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public HashMap<String,String> getHmTest()
	{
		return (HashMap<String,String>)hmTest.clone();
		//return hmTest;
	}
public static void main(String args[])
{
	int i=10;
	 
	String s="Singu";
	HashMap<String,String> test=new HashMap();
	test.put("1","first");
	test.put("2","second");
	ImmutableTest imtest=new ImmutableTest(i,s,test);
	//System.out.print(i==test.getId());
	System.out.print(s==imtest.getName());
	System.out.print(test==imtest.getHmTest());
	System.out.println("id"+imtest.getId());
	 i=20;
	 
	  	System.out.println("id"+imtest.getId());
		        HashMap<String,String> hash=imtest.getHmTest();
				hash.put("3","third");
				System.out.println(imtest.getHmTest());
}
}
	