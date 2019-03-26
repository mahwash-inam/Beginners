/*Find the Majority element*/

#include<iostream>
#include<conio.h>
using namespace std;

void majority(int arr[], int n)
{
	int i, j;
	int k=0;
	int num=n/2;
	for(i=0; i<n;i++)
	{
		k=0;
		for(j=i;j<n; j++)
		{
			if(arr[i]==arr[j])
			{
				k++;
			}
		
			if(k>num)
			{
		    cout<<arr[i]<<"\n";
		    cout<<"k="<<k;
	        }
		}
	} 
			
}


int main()
{
	int arr[]={3,3,4,3,1,3,4,1,3,3};
	int n= sizeof(arr)/sizeof(arr[0]);
	majority(arr,n);
	return 0;
}
