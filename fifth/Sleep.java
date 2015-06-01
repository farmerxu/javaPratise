import java.util.*;
public class  Sleep
{
	public static void main(String []args)
	{
		Mythread m = new Mythread();
		m.start();
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
		}
		m.interrupt();
	}
}

class Mythread extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("===="+new Date()+"===");
			try
			{
				sleep(1000);
				
			} catch(InterruptedException e)
			{
				return ;//结束线程				
			}
		}	
	}
}
