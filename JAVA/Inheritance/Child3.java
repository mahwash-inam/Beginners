class Base3
{
void show()
{
System.out.println("base");

}
}
class Child3 extends Base{

void show()
{
System.out.println("child");

}
public static void main(String args[])
{
Child3 c1= new Child3();
c1.show();
}
}