import java.util.regex.*;

public class FirstReg
{
	public static void main(String []args)
	{
//		p("abc".matches("..."));
		Pattern p = Pattern.compile("...");
		Matcher m = p.matcher("abc");
		p(m.matches());
	}
	public static void p(Object o)
	{
		System.out.println(o);
	}
}
