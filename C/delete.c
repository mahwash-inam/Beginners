//delete lst element
#include<stdio.h>
#include<conio.h>
int main()
{
	int i,arr[10],n;
	printf("Enter the number of elements: ");
	scanf("%d", &n);
	
	for(i=0; i<n; i++)
	{
		printf("Enter the element at arr[%d]:",i+1);
		scanf("%d", &arr[i]);
	}
		    
	n=n-1;
  	for(i=0; i<n; i++)
	{
		printf("%d", &arr[i]);
	}
		getch();
	return 0;
	
}	
