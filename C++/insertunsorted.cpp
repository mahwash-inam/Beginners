
#include<iostream>
#include<conio.h>
using namespace std;

int main()
{
	int arr[]={5,8,7,2,1,6};
	int n= sizeof(arr)/sizeof(arr[0]);
	int i,num,pos;
	cout<<"Enter the number you want to insert:";
	cin>>num;
	cout<<"Enter the pos you want to insert:";
	cin>>pos;
	cout<<endl;
	cout<<"n:"<<n;
		cout<<endl;
	if(pos>n)
	{
	
	for(i=0; i<n; i++){
		cout<<arr[i];
	}
//	n++;
cout<<num;
	cout<<endl;
	arr[i+2]=num;
	cout<<num;
		cout<<endl;
	cout<<i;
	cout<<"num:\n"<<num;
		cout<<endl;
	cout<<"arr[i+1]:\n"<<arr[i+1];
		cout<<endl;
	cout<<"n:"<<n;
		cout<<endl;
	}
	cout<<"n:"<<n;
		cout<<endl;
	for(i=0;i<=n; i++)
	cout<<arr[i];
	getch();
	return 0;
}
