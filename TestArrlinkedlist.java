
import java.util.*;
class TestArrlinkedlist
{
	
	
		
		public static void main(String args[])
		{
			
        ArrayList<String> list=new ArrayList();
        list.add("A");     
        list.add("B");       a[0]=A;
		                     a[1]=B; //a[1]=D;  so change the position of B 1 to 2 
							                                         //     c to 3   
							 a[2]=c;                                 // for 100 records in case of changes the data more shift operations required
        list.add("C");
        //System.out.println(list.remove());
        //System.out.println(list.element());
        //System.out.println(list.element());


        list.add(1,"D");//shift operations are required while making changes data in list obj
        //i want to add data D to B place then B is moved to next index based on shift operation
        //suppose I want to changes data in middle of list in case of bulk data stroed in list then so many shift operations
        // are performed so that is impact on performance

        list.remove(1);//same in case of remove operation if we remove ele in list it means more shift operations 
        //reuired
        // O(n) complexity worst case in case of add and delete from ArrayList
        //O(1) constant time for search operaion

        System.out.println(list.get(1));
        System.out.println(list);
        //System.out.println(list.remove());


			
			
			
	}
	}