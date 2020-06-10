import java.util.*;
public class FebNacciSeries
	{
		static Map<Character,Integer> countArrChar(String st)
		{
			int i=0, count=0;
		     //char ch[]=st.toCharArray();
			 //int j=ch.length-1;
			 int j=st.length()-1;
			 Map<Character,Integer> map=new HashMap();
			 while(i<j)
			 {
				 if(st.charAt(i)==st.charAt(j))
				 {
					 count++;
					 //System.out.print(st.charAt(i));
					 map.put(st.charAt(i), count);
                 }
				 i++;
				 j--;
		}    
		 return map;
		}		
		static boolean isPalindrum(String str)
		{
			int i=0, j=str.length()-1;
			
			while(i<j)
			{
				if(str.charAt(i)!=str.charAt(j))
					return false;
				i++;
				j--;
			}
			return true;
		}
		public static void main(String args[])
		{
			
			
			String name="Singuveera";
			
			Map<Character,Integer> map=countArrChar(name);
			
			Iterator<Character> it=map.keySet().iterator();
			while(it.hasNext())
			{
				Character chh=it.next();
				System.out.println(chh+" "+ map.get(chh)+1);
			}
			
			//palindrum with string
			/* String s="liril";
			if(isPalindrum(s))
				System.out.println("yes");
			else
				System.out.println("No"); */
			
			
			//fibanacci series
			
			/* int a=0;
			int b=1;
			int n=20;
			int c=0;
			while(c<=n)
			{
			    c=a+b;
                a=b;
				 b=c;
				System.out.println(a+" "+b+" "+" count fibnacci Series "+c);
			}  */
			//palindrum program
			
			/* int n=454;
			int  sum=0;
			int r=0;
			int temp=n;
			while(n>0)
			{
			 r=n%10;
			 sum=(sum*10)+r;
			n=n/10;
			System.out.println(sum+" "+n);
			
		}
		if(temp==sum)
			System.out.println("palindrum");
		else
			System.out.println("not palindrum"); */
		
		
		
		//find min value in array
		
		int integers[]=new int[]{2,1,5,6,3};
		
		int minValue=Arrays.stream(integers).min().getAsInt();
		System.out.println(minValue);
		
		}
	}
	