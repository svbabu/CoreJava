class SingletonClass
{   
 private static SingletonClass instance=null;
	
	private SingletonClass()
	{
	}
	public static SingletonClass getInstance()
	{
		if(instance==null){
		instance=new SingletonClass();
		}
		return instance;
	}
	
	public void createAcc(String user, double acc)
	{
		System.out.println("created Account for "+user+" "+acc);
	}
		
public static void main(String args[])
{
   SingletonClass instance1=SingletonClass.getInstance();
   SingletonClass instance2=SingletonClass.getInstance();
   SingletonClass instance3=SingletonClass.getInstance();
      int d1=123456789;
      int d2=23456789;
	  int d3=3456789;
	  
   instance1.createAcc("Singu",d1);
   instance2.createAcc("Sree", d2);
   instance3.createAcc("Shanumuka",d3);
    System.out.print(instance1.hashCode()+" "+instance2.hashCode()+" "+instance3.hashCode());

}
}