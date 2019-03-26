class First
{
int x=10;
void show(int x)
{
this.x=x;
}
void display()
{
System.out.println(x);
}
public static void main(String...s)
{
First f=new First();
f.show(20);
f.display();
}
}