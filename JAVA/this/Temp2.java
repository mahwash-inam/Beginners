class Temp2
{
int x=10;
void show(int y)
{
System.out.println(this);
}
public static void main(String...s)
{
Temp2 t= new Temp2();
System.out.println(t);
t.show(20);

}
}