package _9_Collection;

import java.util.Iterator;
import java.util.TreeSet;

//WAP to create a reverse order view of the elements contained in a given tree set
public class _11_ReverseInTreeSet 
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Aam");
		ts.add("Rani");
		ts.add("Mamayan");
		ts.add("Rami");
		ts.add("Jahul");
		
		System.out.println(ts);
		
		Iterator<String> dts = ts.descendingIterator();
		
		while(dts.hasNext())
		{
		System.out.println(dts.next());
		}
	}
}
