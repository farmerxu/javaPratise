import java.net.*;
import java.io.*;
import java.util.*;
public class ServerTest
{
	public static void main (String []args)  
	{
		try
		{
			ServerSocket ss  = new ServerSocket(19998);
		} catch(IOException e)
		{
			System.out.println("lissten failture!");
		}
		try
			{
				Socket s = ss.accept();
			} catch(IOException e)
			{
				
				System.out.println("accept failture!");
			}

			String line;
			InputStream is = s.getInputStream();
			BufferedReader rs  = new BufferedReader(new InputStreamReader(is));
			PrintWriter ws  = new PrintWriter(s.getOutputStream());
			
			BufferedReader srs  = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("client"+rs.readLine());
			line = srs.readlline();
			while(line.equals("bye"))
			{	
				ws.println(line);
				ws.flush();
				System.out.println("server:"+line);
				System.out.println("client:"+rs.readLine());
			}
		
			is.close();
			ws.close();
			srs.close();
			s.close();
		 } 
}					
