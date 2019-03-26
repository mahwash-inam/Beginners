class Emp1
{
static String cname="TCS";
String name;
int sal;
void get(String n, int s)
{
name=n;
sal=s;
}
void show()
{
System.out.println(cname);
System.out.println(name);
System.out.println(sal);
}
public static void main(String agr[])
{
Emp1 e=new Emp1();
e.get("abc",300);
e.show();
Emp1 e1=new Emp1();
e.get("abcd",3000);
e.show();

}
}