class Thread1 implements Runnable
{
int x=10;
public void run()
{
	for(int i=1;i<=10;i++)
	{
		System.out.println(Thread.currentThread().getName());
	}
}
/*Thread1 tt1=new Thread1("Thread");
tt1.start();*/
}

class RunThread
{
public static void main(String args[])
{
	Thread1 th1=new Thread1();
	Thread tt1=new Thread(th1,"THREAD");
	tt1.start();
	Thread tt2= new Thread(th1,"Thread1");
	tt2.start();
}
}	