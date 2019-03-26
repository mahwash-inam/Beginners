#include<stdio.h>
#include<conio.h>
int main()
{
	int num ;
		int fac;
	printf("Enter the number");
	scanf("%d", &num);
	fac= fact(num);
	printf("Factorial is:%d", fac);
	getch();
	return 0;
}
int fact(int n)
{

 if(n==1 || n==0)
 return 1;
else
return(n*fact(n-1));

}

