package StreamAPI;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
 WAP to take a ArrayList of numbers and print greater than 50 elements.
 */
public class GreaterThan 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> hs= new ArrayList<Integer>();
		hs.add(50);
		hs.add(40);
		hs.add(60);
		hs.add(80);
		hs.add(10);
		hs.add(20);
	//	hs.add(null);
		hs.add(20);
		
		/*	mera method... 
		 
		hs.stream().filter(e->(e>50)).forEach(e->System.out.println(e)); //60		80
		*/
		
		/* sir ka method
		 ------------------------- First type-----------------------------------------
		 
//		Stream<Integer> s=hs.stream();
//		
//		Predicate<Integer> p=(e)->
//										{
//											return e>50;
//										};
//		
//		Consumer<Integer> c=(e)->
//										{
//											System.out.println(e);
//										};
//										
//		s.filter(p).forEach(c);								//60		80
//		
		 */
		
		//------------------------- Second type-----------------------------------------
//		Stream<Integer> s=hs.stream();
//		
//		Predicate<Integer> p=e->e>50;
//												
//		Consumer<Integer> c=e->System.out.println(e);
//																				
//		s.filter(p).forEach(c);								//60		80
		
		//------------------------- Third type-----------------------------------------
		
//		Stream<Integer> s=hs.stream();													
//		s.filter(e->e>50).forEach(e->System.out.println(e));				//60		80
		
		
		//------------------------- Fourth type-----------------------------------------
		
		hs.stream().filter(e->e>50).forEach(e->System.out.println(e));				//60		80
		
	}
}
