/*Java doesnot support copy conctructoer but if we want we can create with the help of parametrized constructor*/

class Copy
{
int x,y;
Copy(int x, int y)
{
this.x=x;
this.y=y;
}
Copy(Copy c)
{
this.x=c.x;
this.y=c.y;
}
void show()
{
System.out.println(x);
System.out.println(y);
}
public static void  main(String...s)
{
Copy c1= new Copy(10,20);
c1.show();

Copy c2=new Copy(c1);
c2.show();
}
}