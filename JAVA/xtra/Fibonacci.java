class Fibonacci
{
 int fib(int num)
 {
 if(num==1|| num==2)
	return 1;
 else 
	return(fib(num-1)+fib(num-2));
 }
 public static void main(String args[])
 {
	Fibonacci f= new Fibonacci();
	for(int i=1; i<=10; i++)
	{
		System.out.print(f.fib(i)+" ");
	}
}
}	
	