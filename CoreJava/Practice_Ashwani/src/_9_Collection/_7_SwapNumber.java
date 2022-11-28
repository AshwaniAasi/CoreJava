package _9_Collection;

import java.util.Collections;
import java.util.LinkedList;

// WAP to swap two elements in a linkedList
public class _7_SwapNumber 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> al=new LinkedList<Integer>();
		al.add(52);
		al.add(72);
		al.add(57);
		al.add(53);
		al.add(22);
		al.add(59);
		al.add(73);
		
		System.out.println("The elements are before swap : \n"+al);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("The swaping of 2nd position element to 5th position");
		Collections.swap(al, 1, 4);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("The elements are after swap : \n"+al);
		
	}
}
