import java.io.*;

public class TextReaderTest 
{
	public static void main (String []arg)
	{
		int c=-1;
		try
		{
			FileReader f = new FileReader("/home/xbb/Desktop/haha.txt");
			while((c=f.read())!=-1)
			{
				System.out.print((char)c);
			}
			f.close();
		}		

		catch(FileNotFoundException e)
		{
			System.out.println("can't find the file ");
		}	
		catch(IOException e)
		{
			System.out.println("output failure ");

		}
	}
}
