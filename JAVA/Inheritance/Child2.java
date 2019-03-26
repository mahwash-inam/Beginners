class Dadaji
{
int x=80;
}
class Papa extends Dadaji{
int x=50;
}
class Child2 extends Papa{
int x=20;

void show()
{

System.out.println(x);
System.out.println(super.x);
System.out.println(((Dadaji)this).x);
}
public static void main(String args[])
{
Child2 c1= new Child2();
c1.show();
System.out.println(((Dadaji)c1).x);
}
}