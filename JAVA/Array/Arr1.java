class Arr1
{
public static void main(String...s)
{

int z[] = new int[]{10,60, 50, 40};
int c= z[0];
for(int i=0; i< z.length; i++)
{
if(z[i] > c)
{
 c = z[i];
}
 }
 System.out.println(" Greatest= " + c);
 }
 }
 