import java.lang.annotation.*;  
import java.lang.reflect.*;  

  
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD) 
@interface MyAnnotation
{
	String value();
	
}
class Hello{
	@MyAnnotation(value="12")
	public void test()
	{

	System.out.println("testing Annotation");
	}
}
class CustomAnnonation
{
	
	public static void main(String args[])throws Exception
	{
		Hello instan= new Hello();
		                Method m=instan.getClass().getMethod("test");
						MyAnnotation mn=m.getAnnotation(MyAnnotation.class);
						System.out.println("value is: "+mn.value());
}}