import java.util.*; 
import java.lang.Cloneable;
 public class Student implements Cloneable  
 {  
 private String name;
 private Address address;
 
  public Student(String name,Address address)
  {
	  this.name=name;
	  this.address=address;
  }
  
  
   public Student clone() throws CloneNotSupportedException
   {
	   Student student=(Student)super.clone();
	   
	   this.address=new Address(address.getStreet(),address.getCity());
	   student.setAddress(address);
	   return student;
   }
   public void setName(String name)
   {
	   this.name=name;
   }
   public void setAddress(Address address)
   {
	   this.address=address;
   }
	 
   public String toString()
  {
	  return name +" "+address.getStreet()+" "+address.getCity();

  }
	public static void main(String args[]) throws CloneNotSupportedException
	{ 
	     Address addrss1=new Address("krpuram","Bangalore");
		          
				  addrss1.street="devasandra";
				  addrss1.city="bangalore";
		         Address copy=addrss1.clone();
				 copy.street="marathalli";
				  copy.city="bangalore";
				 System.out.println(addrss1.hashCode()+"addrss");
				  System.out.println(copy.hashCode()+"cloneaddress");
				 
		 System.out.println(addrss1);
		 // Address addrss2=new Address("krpuram","Bangalore");
		Student original1=new Student("Singu",addrss1);
		//Student origina2=new Student("venu",addrss2);
		
		  
		  
		  Student cloneobj=(Student)original1.clone();
		  cloneobj.setName("prasad");
		  cloneobj.setAddress(copy);
		  System.out.println(original1);
		  System.out.println(cloneobj);
		  System.out.println(original1.hashCode());
		  System.out.println(cloneobj.hashCode());
		  
	}

 }