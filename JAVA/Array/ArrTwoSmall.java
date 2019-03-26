class ArrTwoSmall
{
int min_b(int x[][])
{
 int p = x[0][0];
 for(int a=1; a < x.length; a++)
 {
 for(int b=1; b < x.length; b++)
 {
 if(x[a][b] < p)
 {
 p = x[a][b];
 }
 }
 }
 return (p);
 }
 public static void main(String args[])
 {
 ArrTwoSmall f = new ArrTwoSmall();
 int d[][]= new int[][]{{14,56,78,67},{12,36,07,98},{23,2,77,54},{21,55,34,33}};
 int t= f.min_b(d);
 System.out.println("Smallest value:" + t);
 }
} 