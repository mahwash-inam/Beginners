#include<iostream>
#include<conio.h>
#include<string.h>
using namespace std;

int main()
{
	char c[10];
	char ch[10];
	int i, len;
	cout<<"Enter the string:";
	cin>>c;
	len= strlen(c);
	for(i=0; i<len; i++)
	{
		ch[i]=c[len-i-1];
	}
	cout<<"Reverse="<<ch;
	return 0;
}
