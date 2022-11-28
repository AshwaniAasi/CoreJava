package ArrayList_practice;

import java.util.ArrayList;

public class Test3 
{
	public static void main(String[] args) 
	{
		ArrayList al1=new ArrayList();
		al1.add(50);
		al1.add(40);
		al1.add(20);
		al1.add(30);
		ArrayList al2=new ArrayList();
		al2.add("ashwani");
		al2.add("Anuradha");
		al2.add("Shayam");
		al2.add("rahul");
		ArrayList al3=new ArrayList();
		al3.add("*");
		al3.add("+");
		al3.add("^");
		al3.add("%");
		al3.add("@");
		al3.add("$");
		
		System.out.println(al1);
		System.out.println("--------------------------");
		System.out.println(al2);
		System.out.println("=====================");
		al1.addAll(al2);
		System.out.println(al1);
		System.out.println("--------------------------");
		System.out.println(al2);
		System.out.println("=====================");
		al1.add(al2.addAll(3, al3));
		System.out.println(al1);
		System.out.println("--------------------------");
		System.out.println(al2);
		
		
	}

}
