
import java.net.*;
import java.io.*;
import java.util.*;
public class ServerTest
{
	public static void main (String []args) throws Exception 
	{
		ServerSocket ss  = new ServerSocket(1998);
		while(true)
		{
			Socket s =  ss.accept();
			InputStream is = s.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			OutputStream os = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			System.out.println(dis.readUTF());
			dos.writeUTF("hello,client!!!");
			dis.close();
			dos.flush();
			dos.close();
			s.close();
		}
	}
}
