interface EightI
{  
int result=0,i=0,j=0;
    
   public abstract void m1();
    static void m2(){
	
	System.out.println("static implementation done");
	}
	 default void m3()
	 {
	 System.out.println("default implementation done");
	 }
}

class SubImple implements EightI
{
  public void m1()
   {
   	 System.out.println("abstact implementation done");
   }
   
   //public void m3()
   //{
   //  System.out.println("sub default impl");
   //}
}
   public class EightC
   {
   public static void main(String args[])
   {
   EightI instance =new SubImple();
   
   instance.m1();
   EightI.m2();
   instance.m3();
   }
   }