public class  CustomStack
{
	
	private  int stackArr[];
	private  int top;
	private int stackSize;
	public  CustomStack(int maxSize)
	{
		this.stackSize=maxSize;
		this.stackArr=new int[stackSize];
		top=-1;
	}
	
	public void push(int entry)
	{
		if(isFull()){
			System.out.println("stack is full so increase capacity");
			incrStackCapacity();
		}
		 System.out.println("Adding: "+entry);
		this.stackArr[++top]=entry;
	}
	
	public int pop() throws Exception
	{ 
	if(this.isEmpty()){
		throw new Exception("stack is empty so canot remove element:");
	}
		int entry=this.stackArr[top--];
		System.out.println("Removed entry: "+entry);
		return entry;
	}
	
	 public void incrStackCapacity()
	 {
		 int newStack[]=new int[this.stackSize*2];
		 for(int i=0;i<stackSize;i++)
		 {
			 newStack[i]=this.stackArr[i];
		
		}
		this.stackArr=newStack;
		this.stackSize=this.stackSize*2;
		}
		public boolean isEmpty()
		{
			return top==-1;
		}
      public boolean isFull() 
	  {
		  return (top==stackSize-1);
	  }
	
	public static void main(String args[])
	{
		 CustomStack stackobj=new CustomStack(2);
		 for(int i=1;i<10;i++)
		 {
		 
		stackobj.push(i);
		 }
		  for(int i=1;i<4;i++)
		 {
			 try{
				 stackobj.pop();
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
		 } 
	
		 //customObj.remove(10);
		 //customObj.display();
	}
}