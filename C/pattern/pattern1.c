#include<stdio.h>
int main()
{
    int i,j,k;
    for(i=3;i>=1;i--)
    {
        for(j=3;j>i;j--)
        {

        printf(" ");
        }

   for(k=1;k<i;k--)
        {

        printf(" ");
        }

   for(k=2*i+1;k>=1;k--)
    {
        printf("%d\t",k);

    }
    printf("\n");
    }
}
