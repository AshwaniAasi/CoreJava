package Vector_practices;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Test1 
{
	public static void main(String[] args) 
	{
		Vector v=new Vector();
		System.out.println(v.capacity());
		for (int i=0; i<11; i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
	}
}
