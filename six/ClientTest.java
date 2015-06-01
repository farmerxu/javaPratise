import java.io.*;
import java.net.*;
public class  ClientTest
{
	public static void main(String []args) 
	{
		try{
				Socket sc = new Socket("127.0.0.1",1998);
				OutputStream os = sc.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				InputStream is = sc.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				dos.writeUTF("hello,server!!!");
				System.out.println(dis.readUTF());
				dos.flush();
				dis.close();
				dos.close();
			} catch (IOException e)
			{
				System.out.println("run error ");
			}
	}
}

