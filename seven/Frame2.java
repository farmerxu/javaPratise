import java.awt.*;

public class Frame2
{
	public static void main(String []args)
	{
		MyFrame m1=new MyFrame(100,100,200,200,Color.blue);
		MyFrame m2=new MyFrame(100,100,200,100,Color.yellow);	
		MyFrame m3=new MyFrame(100,100,100,200,Color.red);	
		MyFrame m4=new MyFrame(100,100,100,100,Color.black);	
	}
}

class MyFrame extends Frame
{	
	static int id=0;
	public MyFrame( int x,int y,int w,int h,Color c)
	{
		super("Myframe"+(++id));
		setSize(x,y);
		setLocation(w,h);
		setBackground(c);
		setVisible(true);
	}
}
