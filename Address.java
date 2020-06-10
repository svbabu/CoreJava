class Address implements Cloneable
{
	String street;
	String city;
	public Address(String street,String city)
	{
		this.street=street;
		this.city=city;
	}
	public void setStreet(String street)
	{
		this.street=street;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	/* public Address clone() throws CloneNotSupportedException
	{
		Address address=(Address)super.clone();
		return address;
	} */
	public String getStreet()
	{
		return street;
	}
	public String getCity()
	{
		return city;
	}
	 
   public String toString()
  {
	  return street+" "+city;

  }
}