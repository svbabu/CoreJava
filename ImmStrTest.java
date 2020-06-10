

public class ImmStrTest
{
public static boolean testPrime(int arr[])
{      int k=0;
	for(int i=2;i<arr.length;i++)
	{ 

		if(arr[i]%2==0){
		return false;}
		else if(arr[i]%2!=0 && k==2){
			k++;
			
		return true;
		}
		System.out.println(arr[i]);
	}
		return true;
		
	}
public static void main(String args[])
{
	   int arr[]={3,5,7,11,13,17,19};
	   boolean test=testPrime(arr);
	   System.out.println(test);
}
}

   