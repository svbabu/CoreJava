public class  CustomException
{
	String name;
	int age;
	public int voterAgeValid(String name,int age) throws Exception
	{
		if(age<18){
		throw new Exception("user age is invalid so pls enter valid age");
		}
		System.out.print(name+" "+age);
		return age;
	}
		
	public static void main(String args[])
	{
		 CustomException user=new  CustomException();
		 try{
			 user.voterAgeValid("Singu" ,20);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	}
}