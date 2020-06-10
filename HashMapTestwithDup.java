import java.util.*;


class HashMapTestwithDup
{
	public static void main(String args[])
	{
		String s="singu veera bangalore";
		
		//String st[]=s.split("");
		
		//Map<String,Integer> map=new HashMap<>();
		
		char c[]=s.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		Integer count=null;
		for(Character ch:c)
		{
			if(map.containsKey(ch))
			{   
		        count=map.get(ch);
		        map.put(ch, (count==null)?1:count+1);
			}
			if(count==null){
				map.put(ch,1);
			}
		}
		
		for(Map.Entry entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		String str="hello world  india  hello";
		String st[]=str.split(" ");
		String rev="";
		for(int i=0;i<st.length-1;i++){
		for(int j=st.length-1;j>=0;j--)
		{ 
			//if(st[i]==st[j]){
			rev+=st[j]+" ";
			//}
		}
		}
		
		System.out.println(rev);
	}
}
		
		