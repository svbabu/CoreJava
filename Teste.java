import java.lang.annotation.*;  
import java.lang.reflect.*;  

  
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD) 
@interface MyAnnotation
{
	String value() default "123";
	
}
class Hello{
	@MyAnnotation(value="12")
	public void test()
	{

	System.out.println("testing Annotation");
	}
}
class Teste
{
	
	public static void main(String args[])throws Exception
	{
		Hello instan= new Hello();
		                Method m=instan.getClass().getMethod("test");
						MyAnnotation mn=m.getAnnotation(MyAnnotation.class);
						System.out.println("value is: "+mn.value());
						String s1=new String("hello");
						String s2=new String("hello");
						
						String s3="hello";
						
					int i=s1.hashCode();
					int j=s2.hashCode();
						int k=s3.hashCode();
					System.out.println(i+" "+j+ " "+k);

						
						
}}