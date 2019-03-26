//insertion in sorted array
#include<stdio.h>
#include<conio.h>
int main()
{
	int i,arr[10],n,val;
	int flag=0;
	printf("Enter the number of elements: ");
	scanf("%d", &n);
	
	for(i=0; i<n; i++)
	{
		printf("Enter the element at arr[%d]:",i+1);
		scanf("%d", &arr[i]);
	}
	printf("Enter the number : ");
	scanf("%d", &val);
	for(i=n-1; i>0; i--)
	{
		if(arr[i]>val)
		{
			arr[i+1]=arr[i];
		}
		arr[i]=val;
		break;
	}
	n=n+1;
	for(i=0; i<n;i++)
	{
		printf("%d",arr[i]);
	}
	getch();
	return 0;
	
}
