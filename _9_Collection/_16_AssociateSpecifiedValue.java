package _9_Collection;

import java.util.Map;
import java.util.TreeMap;

// WAP to associate the specified value with the specified key in a TreeMap
public class _16_AssociateSpecifiedValue 
{
	public static void main(String[] args) 
	{
		TreeMap< Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(1, "Green");
		tm.put(2, "Yellow");
		tm.put(3, "Red");
		tm.put(4, "Orange");
		tm.put(5, "Black");
		tm.put(6, "White");
		
		System.out.println(tm);
		
		for( Map.Entry<Integer, String> entry : tm.entrySet())
		{
			System.out.println(entry.getKey() + " => "+ entry.getValue());
		}
		
		
		
	}
}
