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

public class GarbageColl
{
	
	public static void main(String args[])
	{
     A test=new A("white");
    
	test=null;
	
	Runtime.getRuntime().gc();
	}
}