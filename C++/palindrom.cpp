#include<iostream>
#include<conio.h>
#include<string.h>
using namespace std;

int main()
{
	char st[20];
	char s[20];

	int i,length;
	cout<<"Enter a string:";
	cin>>st;
	 length = strlen(st);
	
	for(i=0; i<length;i++)
	{
	s[i]=st[length-i-1];
	break;
	}
	
	if(st[i]==s[i])
	{
		cout<<st <<" is palindrom";
	}
	else
	{
		cout<<st <<" is not palindrom";
	}

	return 0;
}

/*int main(){
    char string1[20];
    int i, length;
    int flag = 0;
    
    cout << "Enter a string: "; cin >> string1;
    
    length = strlen(string1);
    
    for(i=0;i < length ;i++){
        if(string1[i] != string1[length-i-1]){
            flag = 1;
            break;
	   }
	}
    
    if (flag==1) {
        cout << string1 << " is not a palindrome" << endl; 
    }    
    else {
        cout << string1 << " is a palindrome" << endl; 
    }
    system("pause");
    return 0;
}*/
