import java.awt.*;
import java.awt.event.*;

public class ActionListenerTest
{
	public static void main(String []args)
	{	
		Frame f = new Frame("my first Frame");
		f.setSize(130,150);
		f.setBackground(Color.blue);
		f.setVisible(true);
		f.setLocation(250,250);
		f.setResizable(true);
		Button b =new Button("PressMe");
		Monitor bh = new Monitor();
		b.addActionListener(bh);
		f.add(b,BorderLayout.CENTER);
		f.pack();
	}
}

class Monitor implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("pressed!!");
	}
}
