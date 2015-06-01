import java.util.*;
public class  JoinTest
{
	public static void main(String []args)
	{
		Mythread m = new Mythread("haha");
		m.start();
		try
		{
			m.join();
		} catch(InterruptedException e)
		{
		}
		for(int i=1;i<100;i++)	
		{
			System.out.println("I am in the main thread!");
		}
	}
}

class Mythread extends Thread
{
	Mythread(String s)//给线程起一个别名
	{
		super(s);
	}
	public void run()
	{
		for(int i=1;i<10;i++)
		{
			System.out.println("I am "+getName());
			try
			{
				sleep(1000);
				
			} catch(InterruptedException e)
			{
			}
		}
	}
}
