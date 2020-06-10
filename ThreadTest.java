
 class PrintEvenOdd extends Thread
{
	public int num_upto=10;
	
	
	static int num=1;
	int remainder;
	static Object lock=new Object();
	
	PrintEvenOdd(int remainder)
	{
		this.remainder=remainder;
          //this.count=count;
	}
	
	public void run()
	{
		 while(num<num_upto)
		{
			synchronized(lock)
			{ 
			  while(num%2!=remainder)
			  {
				try{
					lock.wait();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			  }//while
			  
			  
			  
				System.out.println(Thread.currentThread().getName()+"  " +num);
				num++;
				lock.notifyAll();
			  }//close synchornaized
		}//close while
	}//close run
}
	public  class ThreadTest{			
			
	public static void main(String args[])throws InterruptedException
	{
		PrintEvenOdd oddObj=new PrintEvenOdd(1);
		PrintEvenOdd EvenObj=new PrintEvenOdd(0);
		//PrintEvenOdd primeObj=new PrintEvenOdd(0,2);
		
		Thread t1=new Thread(oddObj,"Odd");
		Thread t2=new Thread(EvenObj,"Even");
		t1.start();
		t2.start();
		//Thread t3=new Thread(primeObj,"Prime1");
		//Thread t4=new Thread(primeObj,"Prime2");
		
		//t3.start();
		//t4.start();
		
	}
}	
		