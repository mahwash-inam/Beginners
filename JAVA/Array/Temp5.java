class Temp5
{
int x=10;
void show(int y)
{
System.out.println(this);
}
public static void main(String...s)
{
Temp5 e= new Temp5();
System.out.println(e);
e.show(20);
}
}