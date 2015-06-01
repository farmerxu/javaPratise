
import java.awt.*;

public class PaintTest
{
	public static void main(String []args)
	{
		new PaintFrame().launchFrame();
	}
}

class  PaintFrame extends Frame
{
	public void launchFrame()
	{
		setBounds(200,200,400,400);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		Color c = g.getColor();
		g.setColor(Color.red);
		g.fillOval(50,50,50,50);
		g.setColor(Color.green);
		g.fillRect(80,80,40,40);
		g.setColor(c);		
	}
}
