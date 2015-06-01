import java.awt.*;

public class Frame1
{
	public static void main(String []args)
	{	
		Frame f = new Frame("my first Frame");
		f.setSize(130,150);
		f.setBackground(Color.blue);
		f.setVisible(true);
		f.setLocation(250,250);
		f.setResizable(true);
	}
}
