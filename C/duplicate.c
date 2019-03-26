#include<stdio.h>
#include<conio.h>
int main()
{
	int i,j,arr[10],n;
	int flag=0;
	printf("Enter the number of elements: ");
	scanf("%d", &n);
	
	for(i=0; i<n; i++)
	{
		printf("Enter the element at arr[%d]:",i+1);
		scanf("%d", &arr[i]);
	}
	
	for(i=0; i<n; i++)
	{
		for(j=i+1; j<n; j++)
		{
			if(arr[i]==arr[j] && i!=j)
			{
				flag=1;
				printf(" duplicate element found at %d and %d.", i,j);
			}
		}
	}
	if(flag==0)
	{
		printf("No duplicte element.");
	}
}
