
class ThreadB extends Thread{
	
	int total;
	
	@Override
	
	public void run()
	{
		synchronized(this)
		{
			for(int i=1;i<10;i++)
			{
				total+=i;
		   }
		   notify();
		}
    }
}

public class WaitNotify
{
	public static void main(String args[])
	{
		ThreadB b=new ThreadB();
		b.start();
		
		synchronized(b)
		{
			try{
				System.out.println("wait for calling");
				b.wait();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(" "+b.total);
		}
	}
}