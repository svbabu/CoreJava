
@FunctionalInterface
interface Finterface
{
public  int  m1(int a,int b); 

public int m2(int c,int d);
/* default void m2()
{
	System.out.println("testing default method calling");
}
  static void m3()
{
	System.out.println("testing static method calling");
 }*/
}
public class FInterF 
{
	
	public static void main(String args[])
	{
		System.out.println("main is calling");
		
		/* Finterface instnace=new Finterface()
		{
			public void m1()
			{
				System.out.println("Print the java");
			}
		};
		instnace.m1();
		instnace.m2();
		instnace.m3(); */
		
		
		Finterface instnce=(a,b)->{
		 return (a+b);
		};
		//int res=instnce.m1(20,10);
		//System.out.println(res);
		int res=instnce.m1(10,12);
		System.out.println(res);
    }
}
