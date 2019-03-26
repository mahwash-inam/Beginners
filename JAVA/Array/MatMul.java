class MatMul
{
void mmul(int x[][], int y[][])
{int c[][] = new int[x.length][x.length];
System.out.println("Array1:");	
for(int i=0; i< x.length; i++)
{
for(int j=0; j< x[i].length; j++)
{
	System.out.print(x[i][j]+"\t");
	}
	System.out.println();
	}
System.out.println();
System.out.println("Array2:");
for(int i=0; i<y.length; i++)
{
for(int j=0; j< y[i].length; j++)
{
	System.out.print(y[i][j]+"\t");
	}
	System.out.println();
	}
if(x.length == y.length && x[0].length == y[0].length)
		{
for(int i=0; i<x.length; i++)
{
for(int j=0; j< x[i].length; j++)
{
	c[i][j]=x[i][j]*y[i][j];
	}
	}
		}
		
		System.out.println("SUM:");
		for(int i=0; i<x.length; i++)
{
for(int j=0; j< x[i].length; j++)
{
System.out.print(c[i][j]+"\t");
}
System.out.println();
}

	}
public static void main(String args[])
{
	MatMul uni= new MatMul();
	int x[][]=new int[][]{{2,4},{6,1}};
	int y[][]=new int[][]{{3,4},{2,1}};
	int c[][]= new int[2][2];
	uni.mmul(x,y);
	
	
}
}