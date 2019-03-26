class Temp2
{
int x=56;
void show(int x, Temp2 z)
{

System.out.println(x);
System.out.println(z);

}
public static void main(String...d)
{
Temp2 r1=new Temp2();
r1.show(39,r1);
System.out.println(r1.x);
}
}