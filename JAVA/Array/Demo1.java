class Demo1
{
int x=10;
int y=20;
public void finalize()throws Throwable
{
System.out.println("Jawaan Shaheed");
}
static void show()
{
Demo1 d1= new Demo1();
display();
}
static void display()
{
Demo1 d2= new Demo1();
}

public static void main(String args[])throws Exception
{
 show();
for(int i=1; i<=2000; i++)
{
	System.gc();
	Thread.sleep(1000);
}
}
}