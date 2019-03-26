/*Find the Missing Number*/
#include<iostream>
#include<conio.h>
using namespace std;

int missing(int arr[], int n)
{
	int i;
	int total,sum=0;
	int miss;
	total=((n+1)*(n+2))/2;
	for(i=0; i<n; i++)
	{
	sum=sum+arr[i];
}
miss=total-sum;
cout<<miss;
}


int main()
{
	int arr[]={1,2,3,5,6};
	int n=sizeof(arr)/sizeof(arr[0]);
	missing(arr,n);
	return 0;
}
