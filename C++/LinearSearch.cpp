#include<iostream>
#include<conio.h>
using namespace std;

int find_arr(int arr[], int n, int num)
{
	int i;
	for(i=0; i<n; i++)
	{
		if(arr[i]==num)
		{
			return i;
		}
		
	}
	return -1;
}
int main()
{
	int num, pos;
	int arr[]={5,6,8,2,1};
	int n=sizeof(arr)/sizeof(arr[0]);
	cout<<"Enter the number you want to Search:";
	cin>>num;
	
	pos= find_arr(arr,n, num);
	if(pos==-1)
	{
		cout<<"Element not found";
	}
	else
	{
		cout<<"Element found at position:"<<pos+1;
	}
	getch();
}
