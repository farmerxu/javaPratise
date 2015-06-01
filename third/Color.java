enum COLOR 
{
	red,green,blue,black
}
public class Color
{
	public static void main(String []arg)
	{
		for(COLOR c1:COLOR.values())
			for(COLOR c2:COLOR.values())
				for(COLOR c3:COLOR.values())
				{
					if(c1!=c2&&c1!=c3&&c2!=c3)
					{
						System.out.println(c1+","+c2+","+c3);	
					}
				}
	}
}
