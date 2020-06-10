/*
import java.util.*;
 class Student<Clonable> extends Clonable {
	 private String name;
	 public Student(String name)
	 {
		 this.name=name;
	 }
	 public String setName(String name)
	 {
		 this.name=name;
	 }
	 public Student clone() throws CloneNotSupportedException
	 {
		 Student stud=(Student)super.clone();
		 stud.name=(String)name.clone();
		 return stud;
	 }
   public String toString()
  {
	  return name;

  }
	
public class CustomClone
{
	
	
public static void main(String args[])
	{
		Student original=new Student("Svbabu");
		  original.setName("singu");
		  System.out.println(original);
		  
		  Student cloneobj=original.clone();
		  cloneobj.setName("Veera");
		  System.out.println(cloneobj);
	}
}
 }*/
