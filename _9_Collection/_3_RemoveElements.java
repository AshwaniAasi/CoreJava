package _9_Collection;

import java.util.ArrayList;

//WAP to remove the third element from an arrayList
public class _3_RemoveElements
{
	public static void main(String[] args) 
	{

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(52);
		al.add(72);
		al.add(57);
		al.add(53);
		al.add(22);
		al.add(59);
		al.add(73);
		
		System.out.println("The elements are : "+al);
		
		// Enter the number of which element want to remove.
		al.remove(3); // suppose fourth element want to remove
		System.out.println("The new elements are: "+al);
	}
}
