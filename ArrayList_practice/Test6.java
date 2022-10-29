package ArrayList_practice;

import java.util.ArrayList;

public class Test6 
{
	public static void main(String[] args) 
	{
		ArrayList al1=new ArrayList();
		ArrayList al2=new ArrayList();
		
		al1.add(50);
		al1.add(90);
		al1.add(30);
		al1.add(40);
		al1.add(10);
		al1.add(550);
		
		al2.add("ahswani");
		al2.add("rahul");
		al2.add("ahsw");
		al2.add("ani");
		al2.add(50);
		
		al1.contains(al2);
		System.out.println(al1.contains(al2));
		System.out.println(al1);
	}
}
