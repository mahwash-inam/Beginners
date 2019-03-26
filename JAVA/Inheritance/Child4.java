class Base4
{
void show()
{
System.out.println("base");
}
}
class Child4 extends Base4{
void show()
{
System.out.println("child");
super.show();
}
public static void main(String args[])
{
Child4 c1= new Child4();
c1.show();
}
}