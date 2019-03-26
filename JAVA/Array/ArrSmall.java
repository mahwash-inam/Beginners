class ArrSmall{
int min_a(int x[])
{
int a=x[0];
for(int i=1; i<x.length; i++)
{
if(x[i]< a)
{
a= x[i];
}
}
return (a);
}
public static void main(String...s)
{
ArrSmall sm= new ArrSmall();
int y[]= new int[]{50, 68, 14, 35};
int l= sm.min_a(y);
System.out.println("Smallest:"+l);
}
}
