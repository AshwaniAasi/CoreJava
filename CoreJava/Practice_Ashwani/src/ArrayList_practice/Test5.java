package ArrayList_practice;

import java.util.ArrayList;

public class Test5 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(20);
		al.add(60);
		al.add("Ashwani");
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(10);
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		
		System.out.println(al.get(0));
	}
}
