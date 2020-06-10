public class SomeOfThreeNumZero
{
public static void main(String args[])
{
int arr[]={12,3,1,2,-6,5,-8, 6};

for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		for(int k=i+1;k<arr.length;k++)
		{
		int sum=arr[i]+arr[j]+arr[k];
		if(sum==0)
		{
			System.out.print(arr[i]+" "+ arr[j]+" " + arr[k]);
		}
		}
	}
}
    
    
	}
	}
	