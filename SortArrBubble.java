public class SortArrBubble
{
	private int arr[];
	private int index;
	
	public SortArrBubble(int maxSize)
	{
		arr=new int[maxSize];
		index=0;
	}
	
	public void insert(int value)
	{
		arr[index++]=value;
	}
	public void bubbleSort()
	{
		int inner,outer;
		
		for(outer=index-1;outer>0;outer--)
		{
			for(inner=0;inner<outer;inner++)
			{
				if(arr[inner]>arr[inner+1])
				swap(inner,inner+1);
			}
		}
	}
	public void swap(int position1,int position2)
	{
	int temp=arr[position2];
	arr[position2]=arr[position1];
	arr[position1]=temp;
	}
	
	public void display()
	{
		for(int i=0;i<index;i++)
			System.out.println(arr[i]+"");
		System.out.println("");
	}
	public static void main(String args[]){
		SortArrBubble sortObj=new SortArrBubble(10);
		sortObj.insert(10);
		sortObj.insert(11);sortObj.insert(5);sortObj.insert(7);
		System.out.println("Display Elements Before Sort: ");
		sortObj.display();
		sortObj.bubbleSort();
		System.out.println("Display Elements After Sort: ");
		sortObj.display();
	}
}