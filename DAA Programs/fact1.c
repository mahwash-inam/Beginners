#include<stdio.h>
#include<conio.h>
int main()
{
	int num, fac;
	printf("Enter the number:");
	scanf("%d", &num);
	fac=fact(num);
	printf("Factorial =%d", fac);
	getch();
	return 0;
}
int fact(int n)
{int i,f=1;
for(i=n; i>=1; i--)
	{
     f=f*i;
}
   return f;	
}
