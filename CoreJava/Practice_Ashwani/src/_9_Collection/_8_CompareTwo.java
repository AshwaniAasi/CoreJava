package _9_Collection;

import java.util.LinkedList;

//WAP to compare two LinkedList
public class _8_CompareTwo 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> al=new LinkedList<Integer>();
		al.add(52);
		al.add(72);
		al.add(57);
		al.add(73);
		
		LinkedList<Integer> al2=new LinkedList<Integer>();
		al2.add(53);
		al2.add(22);
		al2.add(59);
		al2.add(73);
		
		// comparison output in linked list
		LinkedList<Integer> al3=new LinkedList<Integer>();
		for(int i:al)
		{
			al3.add(al2.contains(i) ? 1 : 0);
		}
		System.out.println(al3);
	}
}
