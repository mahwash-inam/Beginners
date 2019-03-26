class SortA
{
void sort_a(int x[])
{ 
int c= x[0];
for(int i=(x.length-1); i>=0; i--)
{
	for(int j=1; j<=i; j++)
	{
		
     if(x[j-1] > x[j])
      {
		  int temp= x[j-1];
		  x[j-1] = x[j];
		  x[j] = temp;
	  }
	}
}
System.out.println("Sorted Array=" + x);
}
public static void main(String args[])
{
 int a[]= new int[]{4,6,2,1,7};
 SortA r= new SortA();
 r.sort_a(a);
 for(int i=0; i<a.length;i++)
 {
	System.out.println(a[i]);
 }
 }
 }