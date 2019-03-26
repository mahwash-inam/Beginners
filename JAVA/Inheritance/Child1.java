class Base1
{
int x=20;
}
class Child1 extends Base1{
int y=50;
void show()
{
System.out.println(y);
System.out.println(x);
System.out.println(super.x);
System.out.println(this.x);
}
public static void main(String args[])
{
Child1 c1= new Child1();
c1.show();
}
}