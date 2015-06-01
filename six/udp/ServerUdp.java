import java.net.*;

public class ServerUdp
{
	public static void main (String args[]) throws Exception
	{
		byte sdata[]=new byte[100];
		int length=100;
		DatagramPacket sd= new DatagramPacket(sdata,length);
		DatagramSocket sudp= new DatagramSocket(1111);
		while(true)
		{
			sudp.receive(sd);
			System.out.println("hello");
			System.out.println(new String(sdata,0,sd.getLength()));
		}

	}
}
