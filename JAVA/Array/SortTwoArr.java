import java.util.Scanner;
class SortTwoArr
{
void sort_b(int x[][])
{

	for(int i=0; i<x.length; i++)
	{
		for(int j=0; j<x.length-1; j++)
		{
			for(int k= j+1; k<=j; k++)
			{
				if(x[j][0] > x[k][0])
				{
					int temp= x[j][0];
					int temp1= x[j][1];
					x[j][0]=x[k][0];
					x[j][1]=x[k][1];
					x[k][0]=temp;
					x[k][1]=temp1;
				}
			}
		}
	}
	System.out.println(x);
}
public static void main(String...s)
{
	SortTwoArr wab = new SortTwoArr();
	int x[][]= new int[][]{{4,2}, {1,7},{5,4},{8,1},{9,3}};
	wab.sort_b(x);
		for(int i=0; i<x.length; i++)
	{
		for(int j=0; j<x[i].length; j++)
		{
	     System.out.println(x[i][j]);
	}System.out.println();
	}
}
}
