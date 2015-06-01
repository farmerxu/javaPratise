import java.util.*;
import java.io.*;

public class DataTest 
{
	public static void main (String []arg) throws Exception
	{
		FileOutputStream or = new FileOutputStream("/home/xbb/Desktop/test");
		ObjectOutputStream oor = new ObjectOutputStream(or);
		T t=new T();
		oor .writeObject(t);
		oor.close();
		FileInputStream ir = new FileInputStream("/home/xbb/Desktop/test");
		ObjectInputStream iir = new ObjectInputStream(ir);
		T t1=(T) iir.readObject();
		System.out.println(t1.i +" "+t1.j +" "+ t1.k);
		iir.close();
		
	}
}

class T implements Serializable
{
	int i=0;
	int j =9;
	double k =10;
}
