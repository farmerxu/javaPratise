import java.awt.*;

public class Plus
{
	public static void main(String []args)
	{	
		new MyFrame().launchframe();
	}
}

class MyFrame extends Frame
{
	public void launchframe()
	{
		TextField num1 = new TextField();
		TextField num2 = new TextField();
		TextField num3 = new TextField();
		Label lp = new Label("+");
		Button b = new Button();
		add(num1);
		add(lp);
		add(num2);
		add(b);
		add(num3);
		pack();
		setLayout(new FlowLayout());
		setVisible(true);
		setResizable(true);
	}
}
