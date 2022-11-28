package LinkedList_practices;

import java.util.LinkedList;

public class Test1 
{
	public static void main(String[] args) 
	{
		LinkedList ll1=new LinkedList();
		ll1.add(50);
		ll1.add("ashwani");
		ll1.add("rahul");
		ll1.add(80);
		System.out.println(ll1);
		System.out.println(ll1.remove(2)+" : element are removed");
		System.out.println(ll1.removeLast()+" : element are removed");
		System.out.println(ll1);
		ll1.add(2, "rani");
		ll1.addLast(90);
		System.out.println(ll1);
	}
}
