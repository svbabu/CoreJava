import java.util.Arrays;
public class CustomArrayList
{
	private Object arr[];
	private int actualSize=0;
	
	CustomArrayList(int maxSize)
	{
		arr=new Object[maxSize];
		
	}
	
	public void add(Object obj)
	{
		if(arr.length-actualSize<=5)
			increseListSize();
		
	 arr[actualSize++]=obj;
	}
	
	
public Object get(int index)
{
   if(index<actualSize)
   {
	   return arr[index];
	   
   }
   else{
	   throw new ArrayIndexOutOfBoundsException();
}
}


public Object remove(int index)
{
	if(index < actualSize)
	{
		
	Object ob=arr[index];
	arr[index]=null;
	int temp=index;
	while(temp<actualSize)
	{
		arr[temp]=arr[temp++];
		arr[temp++]=null;
		temp++;
	}
	actualSize--;
	return ob;
}
else{
	throw new ArrayIndexOutOfBoundsException();
}
}
public int size()
{
	return actualSize;
}
public void increseListSize(){
		arr=Arrays.copyOf(arr, arr.length*2);
	}
public static void main(String args[])
{
	CustomArrayList custList=new CustomArrayList(10);
	custList.add(12);
	custList.add(11);
	custList.add(16);
	custList.add(5);
    custList.add(13);
	custList.add(9);
	custList.add(1);
	custList.add(15);
	
		//custList.get();
		//custList.remove(10);
		        //int size= custList.indexOf(12);
				
		//custList.remove(size);
		custList.remove(new Integer(1));
		custList.remove(new Integer(2));
		custList.remove(new Integer(3));
		custList.remove(new Integer(4));
		custList.remove(new Integer(5));
		//custList.remove(12);
		for(int k=0;k<custList.size();k++)
		{
			System.out.println(custList.get(k)+" ");
		}
		System.out.print(custList.size());

         
		
	
}
}