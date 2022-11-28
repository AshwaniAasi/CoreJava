package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DiffrenceBWStream
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(25);
		al.add(23);
		al.add(24);
		al.add(27);
		al.add(45);
		al.add(15);
		al.add(78);
		al.add(252);
		al.add(245);
		
		/*
		//print for even number from the ArrayList
		for(int i:al)
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
		}
		*/
		
		/*
		//-----------------------------------------First method------------------------------------------------------
		//print for even number from the ArrayList through Stream API
		Stream<Integer> saveStream = al.stream();
		List<Integer> saveList = saveStream.filter(e-> e%2==0).collect(Collectors.toList());
		System.out.println(saveList);
		*/
		
		/*
		//--------------------------------------------Second mehtod------------------------------------------------
		Stream<Integer> stream = al.stream();
		stream.filter(e->e%2==0).forEach(e->System.out.println(e));
		*/
		
		/*
		//--------------------------------------------Third mehtod------------------------------------------------
		al.stream().filter(e->e%2==0).forEach(e->System.out.println(e));
		*/
		/*
		//WAP to count odd numbers
		long count = al.stream().filter(e->e%2 !=0).count();
		System.out.println(count);
					OR
		System.out.println(al.stream().filter(e->e%2 !=0).count());
		*/
		
		
		
		
		
		
		
		//===================================================================================
		/*		
		//simple method make it long code.....
		String name="Ashwani";
		String s1 = name.concat("Kumar");
		String s2 = s1.toUpperCase();
		int s3 = s2.length();
		System.out.println(s3);
		
		//in short with method chaining..
		String name="Ashwani";
		int length = name.concat("Kumar").intern().toUpperCase().length();
		System.out.println(length);
		*/
		
		
		
		
	}
}
