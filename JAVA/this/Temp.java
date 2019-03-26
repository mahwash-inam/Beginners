class Temp
{
int x=10;
void show(int x, Temp z)
{
System.out.println(x);
System.out.println(z);
}
public static void main(String...s)
{
Temp t= new Temp();
t.show(20, t);
System.out.println(t.x);
}
}