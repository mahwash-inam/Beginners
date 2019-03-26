class Emp2
{
static String cname="TCS";
String name;
int sal;
void get(String n, int s)
{
name=n;
sal=s;
}
static void change(String c)
{
cname=c;
}
void show()
{
System.out.println(cname);
System.out.println(name);
System.out.println(sal);
}
public static void main(String agr[])
{
change("HCL");
Emp2 e=new Emp2();
e.get("abc",300);
e.show();
Emp2 e1=new Emp2();
e.get("abcd",3000);
e.show();

}
}