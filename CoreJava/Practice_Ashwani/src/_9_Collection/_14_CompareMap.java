package _9_Collection;

import java.util.HashMap;

//WAP to check whether a map contains key-value mappings(empty) or not?
public class _14_CompareMap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Green");
		hm.put(2, "Yellow");
		hm.put(3, "Red");
		hm.put(4, "Orange");
		hm.put(5, "Black");
		hm.put(6, "White");

		//check if map is empty
		System.out.println("Is HashMap is empty : "+hm.isEmpty());
		
		//removing all the elements from the linkedMap
		hm.clear();
		
		//check if map is empty
		System.out.println("Is HashMap is empty : "+hm.isEmpty());
		
		
		
	}
}
