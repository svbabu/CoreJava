class Addition extends Thread
{
	
	@Override
	public void run()
	{
		for(int i=0;i<20;i++){
		if(i%2==0)
		System.out.println(i);
		}
	}
}
class Multifly extends Thread
{
	
	@Override
	public void run()
	{
		for(int i=1;i<20;i++){
		if(i%2!=0)
		System.out.println(i);
		}
		}
	
} 

public class OrderJoin 
{
	public static void main(String args[])
	{
		int k=0;
		Addition add=new Addition();
		Multifly mul=new Multifly();
		add.start();
		mul.start();
		try{
			add.join();
			mul.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("start main thread Execution");
		
		
		for(int i=1;i<20;i++){
		if(i%2==0 && k==2){
			k++;
		System.out.println(i);
		}
		}
	}
}