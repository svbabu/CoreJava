import java.util.*; 
public class  QuesTest
{
	
public static void main(String args[])
	{
		//boolean b1,b2,b3;
		 Queue<String> qlist=new LinkedList();
	   // b1=qlist.offer("One");
		//b2=qlist.offer("two");
		//b3=qlist.offer(""); */
		 qlist.offer("One");
		qlist.offer("two");
		qlist.offer("");
		System.out.println(qlist);
		//System.out.println(b1);
		//System.out.println(b2);System.out.println(b3);
			//System.out.println(qlist);
		PriorityQueue tasks=new PriorityQueue();
		tasks.add("task5");tasks.add("task2");tasks.add("task1");
		System.out.println(tasks);
		
			System.out.println(tasks);
		qlist.add("three");
		qlist.add("four");
		qlist.add("five");qlist.add("");
		qlist.peek();System.out.println(qlist);
		
		//qlist.add("six");
		qlist.remove();
		System.out.println(qlist);
		//System.out.println("top value retirval "+top);
	System.out.println(qlist.poll());
	System.out.println(qlist.poll());
		//System.out.println(qlist.poll());
		//Iterator<String> it =qlist.iterator();
		//while(it.hasNext())
		//{
			//System.out.println(it.next()+"");
		//System.out.println(qlist.element());
		//}
		//qlist.remove("five");
				//System.out.println(qlist);
	}
}