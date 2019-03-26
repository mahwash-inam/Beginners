class Ths3
{
int x=10;
void show(Ths3 this, int x)
{
System.out.println(this);
}
public static void main(String args[])
{
Ths3 c=new Ths3();
System.out.println(c);
c.show(20);
}
} 