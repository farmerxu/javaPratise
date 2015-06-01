import java.awt.*;
import java.awt.event.*;

public class ActionListenerTest1
{
	public static void main(String []args)
	{	
		Frame f = new Frame("my first Frame");
		f.setSize(130,150);
		f.setBackground(Color.blue);
		f.setVisible(true);
		f.setLocation(250,250);
		f.setResizable(true);
		Button b =new Button("Start");
		Button c = new Button("Stop");
		Monitor bh = new Monitor();
		b.addActionListener(bh);
		c.addActionListener(bh);
		c.setActionCommand("game over!");
		f.add(b,BorderLayout.CENTER);
		f.add(c,BorderLayout.NORTH);
		f.pack();
	}
}

class Monitor implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("A buttton has been pressed!!!"+e.getActionCommand());
	}
}
