package _9_Collection;

import java.util.HashMap;

// WAP to test if a map contains a mapping for the specified key.
public class _15_MappingSpecifiedKey 
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
				
		System.out.println("The list of hashmap are : \n"+hm);
		
		//check for key
		System.out.println("Checking for Red Color ");
		if(hm.containsValue("Red"))
		{
			System.out.println("Yes this color are present in list");
		}
		else
			System.out.println("No ! this color is not present");
		
	}
}
