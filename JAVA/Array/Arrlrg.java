class ArrLrg
{  
int max_a(int x[])
{
int c= x[0];
for(int i=0; i< x.length; i++)
{
if(x[i] > c)
{
 c = x[i];
}
 }
 return (c);
 }
public static void main(String...s)
{
	ArrLrg m= new ArrLrg();
int z[] = new int[]{10,60, 70, 50, 40};
int a= m.max_a(z);
System.out.println("Greatest=" + a);
 }
}