//a positive integer that is equal to the sum of its proper divisors. The smallest perfect number is 6, which is the sum of 1, 2, and 3. Other perfect numbers are 28 , 496 ,8128


class Perfect
{
public static void main(String...s)
{
	int num=6;int i;
	int sum=0;
	for(i=1; i<num; i++)
	{
		if(num%i==0)
		{
			sum+=i;
			}
	}
 if(sum==i)
{
System.out.println("Number is perfect");
}
else
 System.out.println("Number is not perfect");
 }
 }