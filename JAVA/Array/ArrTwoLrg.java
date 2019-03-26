class ArrTwoLrg
{
int max_b(int x[][])
{
 int d= x[0][0];
 for(int i=1; i< x.length; i++)
 {
 for(int j=1;j< x.length; j++)
 {
 if(x[i][j] > d)
 {
  d= x[i][j];
  }
 }
 } return (d);
}

public static void main(String args[])
{
ArrTwoLrg s= new ArrTwoLrg();
int z[][]= new int[][]{{10, 20, 30, 40},{15, 28, 56, 78},{39, 78, 65, 45},{12,45,67,89}};
int n= s.max_b(z);
System.out.println("Greatest=" +n);
}
}