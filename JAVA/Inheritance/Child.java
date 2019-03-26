class Base
{
int x=20;
}
class Child extends Base{
int x=50;
void show()
{
System.out.println(x);
System.out.println(super.x);
}
public static void main(String args[])
{
Child c1= new Child();
c1.show();
}
}