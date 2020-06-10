import java.util.*;
import java.util.concurrent.*;
class A
{
	void m1()
	{
		System.out.println("hello");
	}
} 
	class B extends A
	{
		
	void m1()throws Exception
	{
		System.out.println("hello");;
	} 
	}	


public class Example
{
   public static void main(String args[])
   {
	 
	 String s="hai";
	    
	   //Optional<String> optional=Optional.ofNullable(s);
	   //if(optional.isPresent()){
		   if(s.equals(null)){
		   System.out.println(s);
	   }
	   else{
		   System.out.println("not a value in string"+s);
	   }
	   
	/* String s="i tell you";
	String revWords[]=s.split(" ");
	
	String rev="";
	for(int j=revWords.length-1;j>=0;j--)
	{
		rev+=revWords[j]+" ";
		
   }
   System.out.println("print rev words");
   System.out.println(rev.substring(0,rev.length()-1)); */
}
}