public class ThreadTest
{
	public static void main (String []args)
	{
		Runner1 r1= new Runner1();
		Thread mythread = new Thread(r1);
		mythread.start();
		for(int i=0;i<100;i++)
		{
			System.out.println("mainthred"+i);
		}
	}
}

class Runner1 implements Runnable
{
	public void run()
	{		
		for(int i=0;i<100;i++)
		{
			System.out.println("runner1  "+i);
		}
	}	
}
