/*
public class ArrayTest
{  
     static void largestNos(int arr[],int arr_size)
	 {
		  int i,first,second,third,fourth; //fetching top four values
		 if(arr_size<3)
		 {
			 System.out.println("invalid entry size");
			 return;
		 }
		third=first=second=fourth=0;
		 
         for(i=0;i<arr_size;i++)
		 {
           if(arr[i]>first)
		   {
			 fourth=third;
             third=second;
             second=first;
             first=arr[i];
		   }
        else if(arr[i]>second)
		{
         		 third=second;	
				  second=arr[i];
		}
		else if(arr[i]>third)
		{
			third=arr[i];
		}
		else if(arr[i]>fourth)
		{
			fourth=arr[i];
		}
		
	}
	System.out.print(first+" "+second+" "+third+" "+fourth); 
	 }
	public static void main(String args[])
	{   
	    int arr[]={3,4,5,1,6};
		
		int size=arr.length;
		
		largestNos(arr,size);
		for(int j=arr.length-1; j>=0; j--)
		{
			for(int i=0; i<j; i++) //or 
				//for(int i=0; i<arr.length-1; i++)
			{
				if(arr[i]>arr[i+1])
				 
					int temp=arr[j];
					  arr[j]=arr[i];
					  arr[i]=temp;
				}
			}
		}
		for(int k=0;k<arr.length; k++)
		{
			System.out.print(arr[k]+" ");
		} 
	}
}*/
