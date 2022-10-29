package ArrayList_practice;

import java.util.ArrayList;

public class Test8 
{
	public static void main(String[] args) 
	{
		ArrayList al1=new ArrayList();
		al1.add(50);
		al1.add(20);
		al1.add(60);
		al1.add(80);
//		al1.add("Ashwani");
		System.out.println(al1.size());
		System.out.println(al1.hashCode());
		System.out.println(al1.lastIndexOf(al1));
	}
}
