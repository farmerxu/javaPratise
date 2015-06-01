import java.io.*;
public class Test_hello
{
	public static void main (String []arg)
	{
		String seperator=File.separator;
		String fileName = "myfile.txt";
		String directory = "mydir1"+seperator+"mydir2";
		File file1= new File(directory,fileName);
		if(file1.exists())
		{
			System.out.println("file's name: "+ file1.getAbsolutePath());
			System.out.println("file's size: "+file1.length());	
		}	
		else
		{
			file1.getParentFile().mkdirs();
			try
			{
				file1.createNewFile();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}	
} 
