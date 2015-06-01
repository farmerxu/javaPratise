import java.io.*;

public class InputStreamTest 
{
	public static void main (String []arg)
	{
		InputStreamReader ir = new InputStreamReader(System.in);
		String s = null;
		BufferedReader bir = new BufferedReader(ir);
		try
		{
			s= bir.readLine();
			while(s!=null)	
			{
				if(s.equalsIgnoreCase("exit"))
				{
					break;
				}
				System.out.println(s);
				s = bir.readLine();
			}
			bir.close();
		}  catch(IOException e)
		{
			System.out.println("error");
		}
	}
}
