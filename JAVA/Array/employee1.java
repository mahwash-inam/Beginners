class Emp
{
String name;
int sal;
void get(String n, int s)
{
name=n;
sal=s;
}
void show()
{
System.out.println(name);
System.out.println(sal);
}
public static void main(String agr[])
{
Emp e=new Emp();
e.get("abc",300);
e.show();
}
}