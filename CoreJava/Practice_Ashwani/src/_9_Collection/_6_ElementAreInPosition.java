package _9_Collection;

import java.util.LinkedList;

//WAP to display the elements and their position in a linkedList
public class _6_ElementAreInPosition 
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
		
		System.out.println("The elements are : "+al);
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println("The Index position is "+i+" & element are : "+al.get(i));
		}
		
		
	}
}
