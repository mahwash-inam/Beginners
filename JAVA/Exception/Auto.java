class Auto{
public static void main(String args[])
{
 try(Demo d= new Demo();
	Demo1 d1 = new Demo1();)
	{
	int x= 10/0;
	d.show();
	d1.show();
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println(e);
	}
	}
}

class Demo implements AutoCloseable	
{
 void show()
{
 System.out.println("Show");
 }
 public void close()
 {
 System.out.println("close for demo");
 }
 }
 
 class Demo1 implements AutoCloseable	
{
 void show()
{
 System.out.println("Show");
 }
 public void close()
 {
 System.out.println("close for demo1");
 }
 }
 