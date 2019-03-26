/*Find the Number Occurring Odd Number of Times*/

#include<iostream>
#include<conio.h>
using namespace std;


/*void occurance(int arr[], int n)
{
	int i, j;
	int k=0;
	
	for(i=0; i<n;i++)
	{
	   k=0;
		for(j=0;j<n; j++)
		{
			if(arr[i]==arr[j])
			{
				k++;
			}
		}
			if(k%2!=0)
			{
		    cout<<arr[i]<<" occurs odd number of times\n"<<"\n";
		    break;
	        }
	} 
			
}*/
void occur(int arr[], int n)
{
int i, res=0;
for(i=0; i<n; i++)
{
	res=res^arr[i];
	}	
	cout<<res;
}

int main()
{
	int arr[]={1,3,1,3,5,1,5};
//int arr[] = { 2, 3, 5, 4, 5, 2,
				//	4, 3, 5, 2, 4, 4, 2 };
	int n= sizeof(arr)/sizeof(arr[0]);
	//occurance(arr,n);
	occur(arr,n);
	return 0;
}

