class A{

	String color;
	public A(String color)
	{
		this.color=color;
	}
	@Override
	public void finalize()
	{
		System.out.println(this.color+" cleanned");
	}
}

public class GCTest
{
	/* 
	public static void main(String args[])
	{
		//in this garbage collector may or may not respond as below code
     A test=new A("white");
    
	test=null;
	
	Runtime.getRuntime().gc();
	} */
	
	public static void main(String args[])
	{
		//in this garbage collector automatically responded respond as below code
     A a=new A("white");
   for (int i = 0; i < 1000000; i++) {
			if (i % 2 == 1) {
				a = new A("red");
			} else {
				a = new A("green");
			}
			a = null;
	}
	}
	
}