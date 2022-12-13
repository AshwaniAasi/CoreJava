package _9_Collection;

import java.util.TreeSet;

// WAP to compare two tree set
public class _12_Compare2TreeSet
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts1=new TreeSet<String>();
		ts1.add("Ashwani");
		ts1.add("Aam");
		ts1.add("Rani");
		ts1.add("Jahul");
		
		System.out.println(ts1);
		
		TreeSet<String> ts2=new TreeSet<String>();
		ts2.add("Mamayan");
		ts2.add("Rami");
		ts2.add("Jahul");
		
		System.out.println(ts2);
		
		for(String s:ts1)
		{
			System.out.println(ts2.contains(s) ? "Yes" : "No");
		}
		
	}
}
