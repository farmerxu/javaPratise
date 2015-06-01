import java.net.*;
import java.io.*;
import java.util.*;
public class ClientUdp
{
	public static void main (String []args) throws Exception 
	{
		byte buf[]="hello world!!!".getBytes();	
		InetSocketAddress address= new InetSocketAddress("127.0.0.1",1111);
		DatagramPacket sdata = new DatagramPacket(buf,buf.length,address);
		DatagramSocket ds = new DatagramSocket();
		ds.send(sdata); 
	}
}
