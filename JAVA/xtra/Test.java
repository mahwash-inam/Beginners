/*use of this
Eg-1:*/

class Test 
{
int x=20;
void show(int x, Test z)
{
System.out.println(z.x);
System.out.println(z);
}
public static void main(String args[])
{
Test t= new Test();
t.show(10,t);
System.out.println(t);
}
}