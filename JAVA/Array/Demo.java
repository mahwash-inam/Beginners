class Demo
{
int x=10;
int y=20;
public void finalize()throws Throwable
{
System.out.println("Jawaan Shaheed");
}
static void show()
{
Demo d1= new Demo();
display();
}
static void display()
{
Demo d2= new Demo();
}
}