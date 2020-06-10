public class DeepCloneTest implements Cloneable
{
	
	public Integer id;
	public String name;
	Address address;
	
	public DeepCloneTest(Integer id,String name,Address address)
	{
		
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public DeepCloneTest clone() throws CloneNotSupportedException
	{
		DeepCloneTest instance=(DeepCloneTest)super.clone();
		//instance.address=new Address(address.getStreet(),address.getCity());
		return instance;
	}
	
	public void setId(Integer id)
	{
		this.id=id;
	}
	public Integer getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAddress(Address address)
	{
		this.address=address;
	}
	public Address getAddress()
	{
		return this.address;
	}
	
	 public static void main(String args[])throws CloneNotSupportedException
	 {
		  Address address=new Address("#52","Devsandra bglr");
		    Address address1=new Address("#55","Devsandra bglr");
		 DeepCloneTest original=new DeepCloneTest(101,"Singu",address);
		 DeepCloneTest copyInstance=(DeepCloneTest)original.clone();
		
		copyInstance.setAddress(address1);
		 
	
		 if(original.hashCode()==copyInstance.hashCode())
		 {
			 System.out.println("shallow");
		 }
		 else if(original.hashCode()!=copyInstance.hashCode()){
		 System.out.println("deep copy");}
	 }}

		 