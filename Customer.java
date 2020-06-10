import java.util.*;
import java.text.*;
public class Customer
{
   	Integer id;
	String name;
	Date dob;
    String mobile ;
	
	public Customer(Integer id,String name,String dob,String mobile)throws Exception
	{
		this.id=id;
		this.name=name;
		
		SimpleDateFormat  sdf=new SimpleDateFormat("dd/mm/yyyy");
		this.dob=sdf.parse(dob);
		this.mobile=mobile;
	}
	
	public String toString()
	{
		return id+" "+name+" "+dob+" "+mobile;
	}
	public static void main(String args[])throws Exception 
	{
		
			//dob.setDate();
		              
		Customer obj=new Customer(101,"Singu","10/04/1980","9620562722");
		System.out.println("Customer Details:::::::" +obj);
	}
}
		
	