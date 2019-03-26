class UniMat
{
void union(int x[], int y[])
{
System.out.print("Array1:");	
for(int i=0; i< x.length; i++)
	System.out.print(x[i]+"\t");
System.out.println();
System.out.print("Array2:");
for(int j=0; j<y.length; j++)
	System.out.print(y[j]+"\t");
}
public static void main(String args[])
{
	UniMat un= new UniMat();
	int x[]=new int[]{2,4,6,1};
	int y[]=new int[]{3,8,9};
	un.union(x,y);
}
}