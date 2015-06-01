import java.util.*;
public class  IteratorTest 
{
	public static   void main (String []args)
	{
		Collection c = new ArrayList();
		c.add(new Character('q'));
		Iterator i = c.iterator();
// for(Iterator i=c.iterastor();i.hashNext();) 也可以实现循环
		while(i.hasNext())
		{
			Character s=(Character)i.next();
			System.out.println(s);
		}
	}

	
}
