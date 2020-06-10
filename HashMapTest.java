import java.util.*;

class A{
	
	/* 
	void test()
	{ int x=0;
	try{
		  x=2%0;
	}
	finally
	{
		System.out.println("finally block "+x);
	} */
		  
//}
}
public class HashMapTest 
{
	
	public static void main(String args[])
	{ 
	
	int arr[]={1,2,3,4,5,6,7,8,9};
	
	
	for(int i=arr.length-1;i>=0; i--)
	{
		
		//System.out.print(arr[i]);
	}
	
		 
		
	//String s1="abc";
	//Integer x=s1.hashCode();
	
   String s1="hello";
	String s2=s1;
	
	 //System.out.println(s1.hashCode());
	 //s1="hello world";
    //System.out.println(s2.hashCode());
	 // System.out.println(s2.hashCode());
	
	
	 //if(s1==s2){
		//System.out.println("both are equla");
		// System.out.println(s1.hashCode());
	  //System.out.print(s2.hashCode());
	//}
	//else{
		//System.out.println("both are not equla");
	//} 
	//s1="cba";
	//Integer  y=s1.hashCode();
	//System.out.println(x);
	//System.out.println(y);
	//A instance=new A();
	
	  // instance.test();
        try
        {
            Class.forName("Hello");
			System.out.println("calling Hello class file:");
        }catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } 
	/* Map<Character,Integer> map=new HashMap();
	map.put('c',2);
	map.put('a',1);
	map.put('b',4);
     /* Iterator<Integer> it=map.values().iterator();
	 while(it.hasNext())
	 {
	
	 System.out.print(it.next()); */
	 //System.out.println(map.values());
	 //for(Map.Entry<Character,Integer> entry:map.entrySet())
	 //{
		 //System.out.println(entry.getKey()+" "+entry.getValue());
	
	 //}
	 //} */
	// System.gc();	
	}

}