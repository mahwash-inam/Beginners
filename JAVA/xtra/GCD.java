class GCD
{
int hcf(int a, int b)
	{
		if(a==b)
			return(a);
		if(a%b==0)
			return (b);
		if(b%a==0)
			return (a);
		if(a>b)
			return(hcf(a%b,b));
		else
			return(hcf(a,b%a));
	}	
public static void main(String...s)
{
	GCD d= new GCD();
	int x=d.hcf(105,91);
	System.out.print(x);
}
}	