#include <iostream>
using std::cout;
int main()
{
    int i = 0;
    cout << (i = 0 ? 1 : 2 ? 3 : 4);
    return 0;
}
