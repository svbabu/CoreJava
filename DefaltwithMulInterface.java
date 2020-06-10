interface InterF1
{
static void show1()
{
  System.out.println("Interface1 static implements done");
}
default void show(int p1,int p2)
{
	  int a=p1,b=p2;
  System.out.println("Interface1 default implements adding two nos "+(a+b));
}
}
interface InterF2
{
default void show(int p1,int p2)
{
	int a=p1,b=p2;
System.out.println("Interface2  default implements subtraction  two nos"+(a-b));
}
}

 class SubImpl implements InterF1,InterF2
 {
	 //override same show method from both interfaces
  public void show(int p1,int p2)
  {
	  int a=p1, b=p2;
  //InterF1.show1();
  InterF1.super.show(p1,p2);
  InterF2.super.show(p1,p2);
  System.out.println("default subimpl done"+a*b);
  }
 } 
 public  class DefaltwithMulInterface
 { 
 public static void main(String args[])
 {
	 
	 InterF1 if1=new InterF1()
	 {
		 public void show(int p1,int p2)
		 {
			 System.out.println("function implementation here using lambda expression: "+(p1+p2));
		 }
	 };
	 if1.show(20,20);
 SubImpl instance=new SubImpl();
 
 
  instance.show(10,20);
  }
  }