/*#include <iostream>
using std::cout;
int main()
{
    int i = 0, j = 0;
    ++++j = ++++i + i++;
    cout << i;
    cout << j;
    return 0;
}*/

#include <iostream>
using std::cout;
int main()
{
    int i = 0, j = 0, k;
    cout<<++i<<"\n";
    cout<<i<<"\n";
    
    i++;
 //   j++ ++;
    k = (i++) + j;
    cout << i<<"\n";
    cout << j<<"\n";
    cout << k;
    return 0;
}
