import java.util.*;

class Student
{
	Integer id;
	String name;
	
	public Student(Integer id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public Integer getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public String toString()
	{
		return this.id+" "+this.name;
	}
}
public class PracticeTest
{  
   public static void main(String args[]){
    ArrayList<Student> al = new ArrayList<>();
	al.add(new Student(1,"A"));
	al.add(new Student(2,"B"));
	al.add(new Student(3,"A"));
	al.add(new Student(1,"C"));
	for(int i=0;i<al.size();i++)
	{
		for(int j=i+1;j<al.size(); j++)
		{
			if(al.get(i).getName().equals(al.get(j).getName())){
				al.remove(j);
			j--;
			}
		}
	}
	System.out.println("After Removing dup:"+al);
     
     
	 String s="1234562155";
	 Integer count=0;
	   char ch[]=s.toCharArray();
	   
	   for(int i=0;i<ch.length;i++)
	   {
		   int m=count;
		   for(int j=i+1;j<ch.length;j++)
		   {
			   if(ch[i]==ch[j])
			   {  
		        ch[m++]=ch[j];
				   System.out.println(ch[j]+" "+ch[m]);
			   }
		   }
	   }
	 
//System.out.println(c+" "+count);		  
	 
	/* public static void main(String args[])
	{
		
	ArrayList<Object> al = new ArrayList<Object>();
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(3);
    al.add(2);
    al.add(5);
    al.add(6);
    al.add(10);
    al.add(5);
    al.add(10);
    System.out.println("Before Duplicate Remove:"+al);
    for(int i=0;i<al.size();i++){
        for(int j=i+1;j<al.size();j++){
            if(al.get(i).equals(al.get(j))){
                al.remove(j);
                j--;
            }
        }
		

	//System.out.print(result+": count:"+count);
}
System.out.print(al); */
}
}