class Emp3
{
static String cname="TCS";
String name;
int sal;
void get(String n, int s)
{
name=n;
sal=s;
}
static int add(int x, int y)
{
return(x+y);
}
void show()
{
System.out.println(cname);
System.out.println(name);
System.out.println(sal);
}
public static void main(String agr[])
{

Emp3 a=new Emp3();
int z= add(10,20);
System.out.println(z);
a.get("abc",300);
a.show();
Emp3 b=new Emp3();

System.out.println(z);
b.get("abcd",3000);
b.show();

}
}