class SortArr
{
 void sort_a(int[] a)
{
	int i;
 for( i= 0; i< a.length; i++)
 {
	 for(int j=i+1; j< a.length; j++)
 {
 if(a[i] > a[j])
 {
	 int temp=a[i];
   a[i]=a[j];
   a[j]=temp;
}
 }
 }
 System.out.println("sort" + a);
}
public static void main(String args[])
{
SortArr l= new SortArr();
int[] a= new int[]{7,4,9,2,89,76,1};
l.sort_a(a);
for(int i:a)
	System.out.println(i);
}
}  