package _9_Collection;

import java.util.ArrayList;

//WAP  to retrieve an element (at a specific index) from a given arrayList.
public class _2_RetrieveElementsByIndex 
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
		
		System.out.println("The first position element are : "+al.get(0));
		System.out.println("The Center position element are : "+al.get(3));
		System.out.println("The Last position element are : "+al.get(6));
	}
}
