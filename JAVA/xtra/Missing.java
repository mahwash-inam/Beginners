class Missing
{
public static void main(String args[])
{
	int arr[]={1,2,3,5,6,7,8};

	int count=1;
	for(int i=0; i<arr.length-1;i++)
	{
		if(arr[i]==count)
		{
			 count++;
			 }
	}
			System.out.println("missing element is:"+count);
			
			
		}}