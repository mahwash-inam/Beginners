/*Merge two UNSORTED array*/

#include<stdio.h>
#include<conio.h>
int main()
{
		
	int i, n1,n2,n3,a[10], b[10], c[20];
	int index=0;

	printf("Enter the number of elements of a:");
	scanf("%d", &n1);
	for(i=0; i<n1; i++)
	{
		scanf("%d",&a[i]);
	}
	printf("Enter the number of elements of b:");
	scanf("%d", &n2);
		for(i=0; i<n2; i++)
	{
		scanf("%d",&b[i]);
	}
	n3=n1+n2;
	for(i=0; i<n1; i++)
	{
		c[index]=a[i];
		index++;
	}
	for(i=0; i<n2;i++)
	{
		c[index]=b[i];
		index++;
	}
	for(i=0; i<n3; i++)
	{
		printf("c[%d]=%d",i,c[i]);
		printf("\n");
	}
	getch();
	return 0;
}
