#include <iostream>
using namespace std;
 
int main()
{
    int a, b, c, max;
 
    cout << "Enter any three numbers" << endl; 
	cin >> a >> b >> c;
    cout << a << "  " << b << "  " << c << endl; 
	if (a > b && a > c) {
        cout << a << " is largest of given three numbers" << endl; 
		}
		 else if (b > a && b > c) {
        cout << b << " is largest of given three numbers" << endl;
    }
    else {
        cout << c << " is largest of given three numbers" << endl;
    }
 
    return 0;
}
