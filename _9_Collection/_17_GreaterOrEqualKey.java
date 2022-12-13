package _9_Collection;

import java.util.TreeMap;

// WAP to get a portion of a map whose keys are greater than or equal to a given key.
public class _17_GreaterOrEqualKey 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(1, "Green");
		tm.put(2, "Yellow");
		tm.put(3, "Red");
		tm.put(4, "Orange");
		tm.put(5, "Black");
		tm.put(6, "White");
		
		System.out.println(tm);
		
		// those key which are greater than 3
		
		System.out.println(tm.tailMap(3));
		
		
	}
}
