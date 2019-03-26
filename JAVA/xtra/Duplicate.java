class Duplicate
{
public static void main(String arg[])
{
 int arr[]={1,2,3,1,5};

 for(int i=0; i<arr.length; i++)
 {
	for(int j=i+1; j<arr.length; j++)
	{
	 if(arr[i]==arr[j])
	 {
	   System.out.println("Duplicate is"+arr[i]);
	 }
	 
}
}

//		 System.out.println("no duplicate");
}
}