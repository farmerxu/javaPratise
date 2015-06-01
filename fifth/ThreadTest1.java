public class ThreadTest1
{
	public static void main(String []arg )
	{
		Mythread m = new Mythread();
		m.start();
		for(int i=1; i < 100;i++)
		{
			System.out.println("MainThread"+i);
		}
	}
}

class Mythread extends Thread
{
	public void run()
	{
		for(int i=1; i < 100;i++)
		{
			System.out.println("Mythred"+i);
		}
	}
}
