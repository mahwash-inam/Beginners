/*use of this
Eg-2:*/

class Test1 
{
int x=20;
void show(int x)
{
System.out.println(this.x);
System.out.println(this);
}
public static void main(String args[])
{
Test1 t1= new Test1();
t1.show(10);
System.out.println(t1);
}
}