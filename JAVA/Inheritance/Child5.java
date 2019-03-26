//UPCASTING

class Base5
{
void show()
{
System.out.println("base");
}
}
class Child5 extends Base5{
void show()
{
System.out.println("child");
super.show();
}
public static void main(String args[])
{
Base5 b= new Child5();
b.show();
}
}