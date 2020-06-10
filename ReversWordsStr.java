
class ReversWordsStr
{
	public static void main(String args[])
	{
		String s="welcome to india";
		 String words[]=s.split(" ");
		 String revStr=" ";
		
		 
			
		
		 for(int j=words.length-1;j>=0; j--)
		 {
			revStr+=words[j]+" ";
		
		 }
		  System.out.print(revStr);
		  //System.out.print(revStr.substring(0,revStr.length()-1));
		 }
		
}

		  