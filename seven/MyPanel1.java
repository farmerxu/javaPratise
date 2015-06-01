
import java.awt.*;

public class MyPanel1
{
	public static void main(String []args)
	{	

		Frame f = new Frame("my first Frame");
		Panel p =new Panel(null);
		f.setLayout(null);
		f.setBackground(new Color(0,0,102));
		f.setBounds(300,300,500,500);
		p.setBackground(new Color(204,204,255));
		p.setBounds(50,50,400,400);
		f.add(p);
		f.setVisible(true);
	}
}

