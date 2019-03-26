#include<iostream>
#include<conio.h>
using namespace std;

int main()
{
	int i,num, flag=0;
	int arr[]={8,2,6,7,1,4,3};
	int n=sizeof(arr)/sizeof(arr[0]);
//	cout<<"Size:"<<n;
	cout<<"Enter the element you want to search:";
	cin>>num;
	for(i=0; i<n; i++)
	{
		if(arr[i]== num)
		flag=1;
		break;
	}
if(flag==1)
cout<<num<<"find at position "<<i+1;
		else
			cout<<" element not found";


	getch();
	return 0;
}
