class Factorial
{
 int fact(int num)
 {
 if(num==0)
	return 1;
 else 
	return(num*fact(num-1));
 }
 public static void main(String args[])
 {
	Factorial f= new Factorial();
	int z=f.fact(6);
	System.out.println(z);
}
}	
	