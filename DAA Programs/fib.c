#include<stdio.h>
#include<conio.h>
void main()
{
	int a,b,c;
	int num,i;
	printf("Enter the number of elements");
	scanf("%d", &num);
	a=0;
	b=1;
	c=a+b;
	printf("Fibonacci series: %d\t%d",a,b);

    for(i=2; i<=num; i++ )
	{
		c=a+b;
		a=b;
		b=c;
	printf("\t %d", c);
	}
	
	getch();
	
}
