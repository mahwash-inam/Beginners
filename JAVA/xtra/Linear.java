public class Linear
{
static int search(int arr[], int n)
{
	int i;
	for(i=0;i<arr.length; i++)
	{
		if(arr[i]==n)
		{
			return i;
		}
	}
		return -1;
}
public static void main(String args[])
{
	int arr[]={2,3,4,5,6,7,8,9};
	int num=1;
	int z= search(arr,num);
	System.out.println(z);
	}
}	