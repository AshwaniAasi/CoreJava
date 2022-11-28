package StreamAPI;

import java.util.ArrayList;

// 1. WAP to print whose name start with A.
// 2. WAP to get the first character of each name.
public class NameStart 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ashwani");
		al.add("Rani");
		al.add("Vikash");
		al.add("anu");
		al.add("Sonu");

		//first Character of list
//		al.stream().map(e->(e.charAt(0))).forEach(e->System.out.println(e)); 		//find only first element
	
//		al.stream().filter(e->e.startsWith("a")).forEach(e->System.out.println(e)); 	// find alphabet with first latter.
		
		//make it Hello, <name> //NOT COMPLETE
//		al.stream().map(e->e.concat("hello, ")).forEach(e->System.out.println(e));
	}
}
