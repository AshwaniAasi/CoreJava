package _9_Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// WAP to convert a hash set to a List/ArrayList.
public class _10_ConvetHashSetToList 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("Aam");
		hs.add("Rani");
		hs.add("Mamayan");
		hs.add("Rami");
		hs.add("Jahul");
		
		System.out.println("The HashSet List are : \n"+hs);
		
		List<String> list=new ArrayList<String>(hs);
		list.add("Aam");
		list.add("Rani");
		list.add("Mamayan");
		list.add("Rami");
		list.add("Jahul");
		System.out.println("The List of ArrayLIst are : \n"+list);
	}
}
